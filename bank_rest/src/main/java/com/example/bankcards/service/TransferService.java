package com.example.bankcards.service;

import com.example.bankcards.dto.TransferDto.TransferDto;
import com.example.bankcards.dto.TransferDto.TransferCreateRequest;

public interface TransferService {
    public TransferDto transfer(TransferCreateRequest transferRequest);
}
