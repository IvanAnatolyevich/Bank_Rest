package com.example.bankcards.controller;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.CardDto.CardResponse;
import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.dto.UserDto.UserResponse;
import com.example.bankcards.entity.BlockRequest;
import com.example.bankcards.entity.StatusUpdateRequest;
import com.example.bankcards.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/{adminId}")
@RequiredArgsConstructor
public class AdminCardController {
    private final AdminService adminService;


    @PostMapping("/cards/{userId}") // ПРОВЕРКА:
    public ResponseEntity<CardResponse> createCard(@RequestBody CardCreateRequest cardCreateRequest) {
        CardResponse cardResponse = adminService.createCard(cardCreateRequest);
        return new ResponseEntity<>(cardResponse, HttpStatus.CREATED);
    }

    @PostMapping // ПРОВЕРКА:
    public ResponseEntity<UserResponse> createUser(@RequestBody UserCreateRequest userCreateRequest) {
        UserResponse userResponse = adminService.createUser(userCreateRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }

    @PutMapping("/cards/{cardId}/status") // ПРОВЕРКА:
    public ResponseEntity<CardResponse> updateStatus(@PathVariable int cardId,
                                                     @RequestBody StatusUpdateRequest statusUpdateRequest) {
        CardResponse cardResponse = adminService.updateStatus(cardId, statusUpdateRequest);
        return new ResponseEntity<>(cardResponse, HttpStatus.OK);
    }

    @DeleteMapping("/cards/{cardId}") // ПРОВЕРКА:
    public ResponseEntity<Void> deleteCard(@PathVariable int cardId) {
        adminService.deleteCard(cardId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/block-requests") // ПРОВЕРКА:
    public ResponseEntity<List<BlockRequest>> getBlockRequests() {
        List<BlockRequest> blockRequests = adminService.getBlockRequests();
        return new ResponseEntity<>(blockRequests, HttpStatus.OK);
    }

}
