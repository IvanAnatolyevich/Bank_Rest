package com.example.bankcards.service.Impl;

import com.example.bankcards.dto.TransferDto.TransferDto;
import com.example.bankcards.dto.TransferDto.TransferCreateRequest;
import com.example.bankcards.entity.Card;
import com.example.bankcards.entity.Status;
import com.example.bankcards.entity.Transfer;
import com.example.bankcards.exception.CardAlreadyBlockedException;
import com.example.bankcards.exception.InsufficientFundsException;
import com.example.bankcards.exception.NotFoundException;
import com.example.bankcards.mapper.TransferMapper;
import com.example.bankcards.repository.CardRepository;
import com.example.bankcards.repository.TransferRepository;
import com.example.bankcards.service.TransferService;
import jakarta.transaction.Transactional;
import jakarta.transaction.TransactionalException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TransferServiceImpl implements TransferService {
    private final CardRepository cardRepository;
    private final TransferRepository transferRepository;
    @Override
    @Transactional
    public TransferDto transfer(TransferCreateRequest transferRequest) {
        Card toCard = cardRepository.findById(transferRequest.getToCardId())
                .orElseThrow(()-> new NotFoundException("Карта с id" + transferRequest.getToCardId() + " не найдена"));
        Card fromCard = cardRepository.findById(transferRequest.getFromCardId())
                .orElseThrow(()-> new NotFoundException("Карта с id" + transferRequest.getFromCardId() + " не найдена"));
        if (fromCard.getStatus() != Status.ACTIVE) {
            throw new CardAlreadyBlockedException("Карта, с которой вы переводите, неактивна");
        }
        if (toCard.getStatus() != Status.ACTIVE) {
            throw new CardAlreadyBlockedException("Карта, на которую осуществляется перевод, неактивна");
        }
        if (fromCard.getBalance() < transferRequest.getAmount()) {
            throw new InsufficientFundsException("Недостаточно средств");
        }

        fromCard.setBalance(fromCard.getBalance() - transferRequest.getAmount());
        toCard.setBalance(toCard.getBalance() + transferRequest.getAmount());

        cardRepository.save(fromCard);
        cardRepository.save(toCard);


        Transfer transfer = TransferMapper.transferRequestToTransfer(transferRequest);
        transferRepository.save(transfer);


        return TransferMapper.transferToTransferDto(transfer);
    }
}
