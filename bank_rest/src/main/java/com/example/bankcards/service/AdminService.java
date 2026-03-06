package com.example.bankcards.service;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.CardDto.CardResponse;
import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.dto.UserDto.UserResponse;
import com.example.bankcards.entity.BlockRequest;
import com.example.bankcards.entity.StatusUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AdminService {
    public CardResponse createCard(CardCreateRequest cardCreateRequest);

    public CardResponse updateStatus(int id, StatusUpdateRequest statusUpdateRequest);

    public void deleteCard(int id);

    public List<BlockRequest> getBlockRequests();

    public UserResponse createUser(UserCreateRequest userCreateRequest);


}
