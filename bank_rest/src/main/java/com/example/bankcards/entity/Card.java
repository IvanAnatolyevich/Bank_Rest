package com.example.bankcards.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
public class Card {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="card_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private String cardNumber;
    @Column
    private String cardHolder;
    @Column
    private LocalDate validityPeriod;
    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column
    private double balance;
    @Column
    @Enumerated(EnumType.STRING)
    private Currency currency = Currency.RUB;


}
