package com.example.bankcards.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
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
    private User owner;
    @Column
    private String cardNumber;
    @Column
    private String cardHolder;
    @Column
    private LocalDate validityPeriod;
    @Column
    private Status status;
    @Column
    private double balance;
    @Column
    private String currency = "RUB";


}
