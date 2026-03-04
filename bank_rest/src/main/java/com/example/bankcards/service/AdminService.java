package com.example.bankcards.service;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.entity.BlockRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AdminService {
    public CardDto createCard(CardCreateRequest cardCreateRequest);

    public CardDto updateStatus(int id);

    public void deleteCard(int id);

    public List<BlockRequest> getBlockRequests();

    public UserDto createUser(UserCreateRequest userCreateRequest);


}
