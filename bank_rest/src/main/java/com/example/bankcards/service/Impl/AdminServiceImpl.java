package com.example.bankcards.service.Impl;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.entity.BlockRequest;
import com.example.bankcards.repository.BlockeRequestRepository;
import com.example.bankcards.repository.UserRepository;
import com.example.bankcards.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminServiceImpl implements AdminService {
    private final UserRepository userRepository;
    private final BlockeRequestRepository blockeRequestRepository;

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

    @Override
    public List<BlockRequest> getBlockRequests() {
        return blockeRequestRepository.findAll();
    }

    @Override
    public UserDto createUser(UserCreateRequest userCreateRequest) {
        return null;
    }

}
