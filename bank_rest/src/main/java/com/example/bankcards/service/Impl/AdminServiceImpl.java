package com.example.bankcards.service.Impl;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.entity.BlockRequest;
import com.example.bankcards.entity.Card;
import com.example.bankcards.entity.User;
import com.example.bankcards.exception.NotFoundException;
import com.example.bankcards.mapper.CardMapper;
import com.example.bankcards.mapper.UserMapper;
import com.example.bankcards.repository.BlockeRequestRepository;
import com.example.bankcards.repository.CardRepository;
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
    private final CardRepository cardRepository;

    @Override
    public CardDto createCard(CardCreateRequest cardCreateRequest) {
        Card card = CardMapper.cardRequestToCard(cardCreateRequest);
        cardRepository.save(card);
        return CardMapper.cardToCardDto(card);
    }

    @Override
    public CardDto updateStatus(int id) {
        return null;
    }

    @Override
    public void deleteCard(int cardId) {
        cardRepository.findById(cardId)
                .orElseThrow(()-> new NotFoundException("Карта с id " + cardId + " не найдена"));
        cardRepository.deleteById(cardId);
    }

    @Override
    public List<BlockRequest> getBlockRequests() {
        return blockeRequestRepository.findAll();
    }

    @Override
    public UserDto createUser(UserCreateRequest userCreateRequest) {
        User user = UserMapper.userRequestToUser(userCreateRequest);
        userRepository.save(user);
        return UserMapper.userToUserDto(user);
    }

}
