package com.example.bankcards.service;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;

public interface AdminService {
    public CardDto createCard(CardCreateRequest cardCreateRequest);

    public CardDto updateStatus(int id);

    public void deleteCard(int id);



}
