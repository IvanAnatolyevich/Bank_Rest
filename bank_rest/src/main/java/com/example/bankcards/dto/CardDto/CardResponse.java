package com.example.bankcards.dto.CardDto;

import com.example.bankcards.entity.Currency;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CardResponse {
    private String cardNumber;

    private String cardHolder;

    private LocalDate validityPeriod;

    private Currency currency = Currency.RUB;
}
