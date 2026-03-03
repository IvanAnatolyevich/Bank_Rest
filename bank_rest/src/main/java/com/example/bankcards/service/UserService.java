package com.example.bankcards.service;

import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.TransferDto.TransferRequest;
import com.example.bankcards.entity.Transfer;

import java.util.List;

public interface UserService {
    public List<CardDto> getCards();

    public CardDto getCard(int id);

    public boolean requestBlock(int id);

    public Transfer transfer(TransferRequest transferRequest);

    public float getBalance();
}
