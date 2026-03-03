package com.example.bankcards.controller;


import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.TransferDto.TransferRequest;
import com.example.bankcards.entity.Transfer;
import com.example.bankcards.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/cards")
@RequiredArgsConstructor
public class UserCardController {
    private final UserService userService;


    @GetMapping
    public ResponseEntity<List<CardDto>> getCards() {
        List<CardDto> card = userService.getCards();
        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    @GetMapping("/{cardId}")
    public ResponseEntity<CardDto> getCard(@PathVariable int cardId) {
        CardDto card = userService.getCard(cardId);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    @PostMapping("/{cardId}/block")
    public ResponseEntity<Void> requestBlock(@PathVariable int id) {
        userService.requestBlock(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/transfer")
    public ResponseEntity<Transfer> transfer(@RequestBody TransferRequest transfer) {
        Transfer newTransfer = userService.transfer(transfer);
        return new ResponseEntity<>(newTransfer, HttpStatus.OK);
    }

    @GetMapping("/balance")
    public ResponseEntity<Float> getBalance() {
        Float balance = userService.getBalance();
        return new ResponseEntity<>(balance, HttpStatus.OK);
    }

}
