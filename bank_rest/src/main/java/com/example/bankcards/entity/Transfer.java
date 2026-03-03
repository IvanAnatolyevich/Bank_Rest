package com.example.bankcards.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Transfer {
    private int id;
    private float amount;
    int fromCardId;
    int toCardId;
    private int date;

}
