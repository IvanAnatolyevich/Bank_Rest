package com.example.bankcards.controller;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.entity.BlockRequest;
import com.example.bankcards.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/{adminId}")
@RequiredArgsConstructor
public class AdminCardController {
    private final AdminService adminService;


    @PostMapping("/cards/{userId}")
    public ResponseEntity<CardDto> createCard(@RequestBody CardCreateRequest cardCreateRequest) {
        CardDto cardDto = adminService.createCard(cardCreateRequest);
        return new ResponseEntity<>(cardDto, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserCreateRequest userCreateRequest) {
        UserDto userDto = adminService.createUser(userCreateRequest);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    @PutMapping("/cards/{cardId}/status")
    public ResponseEntity<CardDto> updateStatus(@PathVariable int cardId) {
        CardDto cardDto = adminService.updateStatus(cardId);
        return new ResponseEntity<>(cardDto, HttpStatus.OK);
    }

    @DeleteMapping("/cards/{cardId}")
    public ResponseEntity<Void> deleteCard(@PathVariable int cardId) {
        adminService.deleteCard(cardId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/block-requests")
    public ResponseEntity<BlockRequest> getBlockRequests() {
        return null;
    }

}
