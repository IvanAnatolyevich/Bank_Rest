package com.example.bankcards.mapper;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.CardDto.CardResponse;
import com.example.bankcards.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    Card cardRequestToCard(CardCreateRequest cardCreateRequest);

    CardDto cardToCardDto(Card card);

    CardResponse cardToCardResponse(Card card);
}