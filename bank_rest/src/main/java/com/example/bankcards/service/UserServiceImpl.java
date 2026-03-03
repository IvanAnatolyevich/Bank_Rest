package com.example.bankcards.service;

import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.TransferDto.TransferRequest;
import com.example.bankcards.entity.Transfer;
import com.example.bankcards.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<CardDto> getCards() {
        return null;
    }

    @Override
    public CardDto getCard(int id) {
        return null;
    }

    @Override
    public boolean requestBlock(int id) {
        return false;
    }

    @Override
    public Transfer transfer(TransferRequest transferRequest) {
        return null;
    }

    @Override
    public float getBalance() {
        return 0;
    }
}
