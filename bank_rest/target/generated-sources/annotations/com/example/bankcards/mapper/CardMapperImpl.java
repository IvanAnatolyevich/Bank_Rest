package com.example.bankcards.mapper;

import com.example.bankcards.dto.CardDto.CardCreateRequest;
import com.example.bankcards.dto.CardDto.CardDto;
import com.example.bankcards.dto.CardDto.CardResponse;
import com.example.bankcards.entity.Card;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T11:57:42+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class CardMapperImpl implements CardMapper {

    @Override
    public Card cardRequestToCard(CardCreateRequest cardCreateRequest) {
        if ( cardCreateRequest == null ) {
            return null;
        }

        Card card = new Card();

        card.setCardNumber( cardCreateRequest.getCardNumber() );
        card.setCardHolder( cardCreateRequest.getCardHolder() );
        card.setValidityPeriod( cardCreateRequest.getValidityPeriod() );
        card.setCurrency( cardCreateRequest.getCurrency() );

        return card;
    }

    @Override
    public CardDto cardToCardDto(Card card) {
        if ( card == null ) {
            return null;
        }

        CardDto cardDto = new CardDto();

        if ( card.getId() != null ) {
            cardDto.setId( card.getId() );
        }
        cardDto.setCardNumber( card.getCardNumber() );
        cardDto.setCardHolder( card.getCardHolder() );
        cardDto.setValidityPeriod( card.getValidityPeriod() );
        if ( card.getCurrency() != null ) {
            cardDto.setCurrency( card.getCurrency().name() );
        }

        return cardDto;
    }

    @Override
    public CardResponse cardToCardResponse(Card card) {
        if ( card == null ) {
            return null;
        }

        CardResponse cardResponse = new CardResponse();

        cardResponse.setCardNumber( card.getCardNumber() );
        cardResponse.setCardHolder( card.getCardHolder() );
        cardResponse.setValidityPeriod( card.getValidityPeriod() );
        cardResponse.setCurrency( card.getCurrency() );

        return cardResponse;
    }
}
