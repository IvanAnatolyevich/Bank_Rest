package com.example.bankcards.mapper;

import com.example.bankcards.dto.TransferDto.TransferCreateRequest;
import com.example.bankcards.dto.TransferDto.TransferDto;
import com.example.bankcards.entity.Transfer;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class TransferMapper {

    public static Transfer transferRequestToTransfer(TransferCreateRequest transferCreateRequest) {
        Transfer transfer = new Transfer();
        transfer.setAmount(transferCreateRequest.getAmount());
        transfer.setTime(transferCreateRequest.getTime());
        transfer.setFromCardId(transferCreateRequest.getFromCardId());
        transfer.setToCardId(transferCreateRequest.getToCardId());
        transfer.setDescription(transferCreateRequest.getDescription());
        return transfer;
    }

    public static TransferDto transferToTransferDto(Transfer transfer) {
        TransferDto transferDto = new TransferDto();
        transferDto.setTransferId(transfer.getTransferId());
        transferDto.setAmount(transfer.getAmount());
        transferDto.setTime(transfer.getTime());
        transferDto.setFromCardId(transfer.getFromCardId());
        transferDto.setToCardId(transfer.getToCardId());
        transferDto.setDescription(transfer.getDescription());
        return transferDto;
    }
}
