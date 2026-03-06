package com.example.bankcards.mapper;

import com.example.bankcards.dto.TransferDto.TransferCreateRequest;
import com.example.bankcards.dto.TransferDto.TransferDto;
import com.example.bankcards.dto.TransferDto.TransferResponse;
import com.example.bankcards.entity.Transfer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransferMapper {
    Transfer transferRequestToTransfer(TransferCreateRequest transferCreateRequest);

    TransferDto transferToTransferDto(Transfer transfer);

    TransferResponse transferToTransferResponse(Transfer transfer);
}
