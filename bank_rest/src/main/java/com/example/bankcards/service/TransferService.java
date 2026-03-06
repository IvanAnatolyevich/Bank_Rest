package com.example.bankcards.service;

import com.example.bankcards.dto.TransferDto.TransferDto;
import com.example.bankcards.dto.TransferDto.TransferCreateRequest;
import com.example.bankcards.dto.TransferDto.TransferResponse;

public interface TransferService {
    public TransferResponse transfer(TransferCreateRequest transferRequest);
}
