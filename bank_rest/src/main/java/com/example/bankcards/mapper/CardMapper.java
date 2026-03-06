package com.example.bankcards.mapper;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.CardDto.CardResponse;
import com.example.bankcards.entity.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CardMapper {
    Card cardRequestToCard(CardCreateRequest cardCreateRequest);

    CardDto cardToCardDto(Card card);

    @Mapping(target = "cardNumber", expression = "java(NumberCardMask.mask(card.getCardNumber()))")
    CardResponse cardToCardResponse(Card card);
}