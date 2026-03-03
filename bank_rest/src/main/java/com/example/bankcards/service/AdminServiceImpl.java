package com.example.bankcards.service;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;

    @Override
    public CardDto createCard(CardCreateRequest cardCreateRequest) {
        return null;
    }

    @Override
    public CardDto updateStatus(int id) {
        return null;
    }

    @Override
    public void deleteCard(int id) {

    }
}
