package com.example.bankcards.controller;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/cards")
@RequiredArgsConstructor
public class AdminCardController {
    private final AdminService adminService;

    @PostMapping
    public ResponseEntity<CardDto> createCard(@RequestBody CardCreateRequest cardCreateRequest) {
        CardDto cardDto = adminService.createCard(cardCreateRequest);
        return new ResponseEntity<>(cardDto, HttpStatus.CREATED);
    }

    @PutMapping("/{cardId}/status")
    public ResponseEntity<CardDto> updateStatus(@PathVariable int cardId) {
        CardDto cardDto = adminService.updateStatus(cardId);
        return new ResponseEntity<>(cardDto, HttpStatus.OK);
    }

    @DeleteMapping("/{cardId}")
    public ResponseEntity<Void> deleteCard(@PathVariable int cardId) {
        adminService.deleteCard(cardId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
