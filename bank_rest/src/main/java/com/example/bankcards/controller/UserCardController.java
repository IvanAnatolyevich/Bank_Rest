package com.example.bankcards.controller;


import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.CardDto.CardResponse;
import com.example.bankcards.dto.TransferDto.TransferDto;
import com.example.bankcards.dto.TransferDto.TransferCreateRequest;
import com.example.bankcards.dto.TransferDto.TransferResponse;
import com.example.bankcards.entity.BlockRequest;
import com.example.bankcards.service.TransferService;
import com.example.bankcards.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/{userId}/cards")
@RequiredArgsConstructor
public class UserCardController {
    private final UserService userService;
    private final TransferService transferService;


    @GetMapping()  // ПРОВЕРКА:
    public ResponseEntity<List<CardResponse>> getCards(@PathVariable int userId) {
        List<CardResponse> card = userService.getCards(userId);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    @GetMapping("/{cardId}") // ПРОВЕРКА:
    public ResponseEntity<CardResponse> getCard(@PathVariable int cardId) {
        CardResponse card = userService.getCard(cardId);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    @PostMapping("/{cardId}/block") // ПРОВЕРКА:
    public ResponseEntity<BlockRequest> createRequestBlock(@PathVariable int userId, @PathVariable int cardId) {
        BlockRequest blockRequest = userService.requestBlock(cardId, userId);
        return new ResponseEntity<>(blockRequest, HttpStatus.CREATED);
    }

    @PostMapping("/transfer") // ПРОВЕРКА:
    public ResponseEntity<TransferResponse> transfer(@RequestBody TransferCreateRequest transfer) {
        TransferResponse transferResponse = transferService.transfer(transfer);
        return new ResponseEntity<>(transferResponse, HttpStatus.CREATED);
    }

    @GetMapping("/balance/{cardId}") //ПРОВЕРКА:
    public ResponseEntity<Double> getBalance(@PathVariable int cardId) {
        double balance = userService.getBalance(cardId);
        return new ResponseEntity<>(balance, HttpStatus.OK);
    }

}
