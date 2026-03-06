package com.example.bankcards.dto.TransferDto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TransferResponse {
    private int toCardId;
    private int fromCardId;

    private float amount;

    private String description;
    private LocalDateTime time;
}
