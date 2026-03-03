package com.example.bankcards.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private Integer id;
    private User owner;
    private String numberCard;
    private String cardHolder;
    private LocalDate validityPeriod;
    private Status status;
    private Double balance;


}
