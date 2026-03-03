package com.example.bankcards.dto.CardDto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CardCreateRequest {
    private String cardNumber;

    private String cardHolder;

    private LocalDate validityPeriod;

    private String currency = "RUB";
}
