package com.example.bankcards.service;

import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.entity.BlockRequest;

import java.util.List;

public interface UserService {
    public List<CardDto> getCards(int id);

    public CardDto getCard(int id);

    public BlockRequest requestBlock(int cardId, int userId);

    public double getBalance(int cardId);
}
