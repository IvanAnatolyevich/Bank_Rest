package com.example.bankcards.service.Impl;

import com.example.bankcards.dto.CardDto.CardResponse;
import com.example.bankcards.entity.*;
import com.example.bankcards.exception.AccessDeniedException;
import com.example.bankcards.exception.BlockRequestAlreadyExistsException;
import com.example.bankcards.exception.CardAlreadyBlockedException;
import com.example.bankcards.exception.NotFoundException;
import com.example.bankcards.mapper.CardMapper;
import com.example.bankcards.repository.BlockeRequestRepository;
import com.example.bankcards.repository.CardRepository;
import com.example.bankcards.repository.UserRepository;
import com.example.bankcards.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final CardRepository cardRepository;
    private final BlockeRequestRepository blockRequestRepository;
    private final CardMapper cardMapper;


    @Override
    public List<CardResponse> getCards(int userId) {
        return cardRepository.findByUserId(userId).stream().map((user) -> cardMapper.cardToCardResponse(user)).collect(Collectors.toList());
    }

    @Override
    public CardResponse getCard(int cardId) {
        Card card = cardRepository.findById(cardId).orElseThrow(() ->
                new NotFoundException("Карта с id " + cardId + " не найдена"));
        return cardMapper.cardToCardResponse(card);
    }

    @Override
    @Transactional
    public BlockRequest requestBlock(int cardId, int userId) {
        Card card = cardRepository.findById(cardId).orElseThrow(() ->
                new NotFoundException("Карта с id " + cardId + " не найдена"));
        if (!(card.getUser().getId() == userId)) {
            throw new AccessDeniedException("Эта карта вам не принадлежит");
        }
        if (card.getStatus() == Status.BLOCKED) {
            throw new CardAlreadyBlockedException("Карта уже заблокирована");
        }
        if (card.getStatus() == Status.BLOCK_REQUESTED) {
            throw new BlockRequestAlreadyExistsException("Запрос на блокировку уже создан");
        }
        card.setStatus(Status.BLOCK_REQUESTED);
        cardRepository.save(card);


        BlockRequest blockRequest = new BlockRequest();
        blockRequest.setCardId(cardId);
        blockRequest.setUserId(userId);
        blockRequest.setRequestedAt(LocalDateTime.now());
        blockRequest.setBlockedStatus(BlockedStatus.PENDING);
        blockRequestRepository.save(blockRequest);


        return blockRequest;
    }

    @Override
    public double getBalance(int cardId) {
        Card card = cardRepository.findById(cardId).orElseThrow(() ->
                new NotFoundException("Карта с id " + cardId + " не найдена"));
        return card.getBalance();
    }
}
