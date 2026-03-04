package com.example.bankcards.mapper;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.entity.Card;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class CardMapper {

    public static Card cardRequestToCard(CardCreateRequest cardCreateRequest) {
        Card card = new Card();
        card.setCardNumber(cardCreateRequest.getCardNumber());
        card.setCardHolder(cardCreateRequest.getCardHolder());
        card.setValidityPeriod(cardCreateRequest.getValidityPeriod());
        return card;
    }

    public static CardDto cardToCardDto(Card card) {
        CardDto cardDto = new CardDto();
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setCardHolder(card.getCardHolder());
        cardDto.setValidityPeriod(card.getValidityPeriod());
        return cardDto;
    }
}
