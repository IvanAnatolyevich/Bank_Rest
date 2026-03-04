package com.example.bankcards.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transfers")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transfer_id")
    private int transferId;
    @Column
    private float amount;
    @Column
    int fromCardId;
    @Column
    int toCardId;
    @Column
    private LocalDate date;
    @Column
    private String description;
    @Column
    private LocalDateTime time;

}
