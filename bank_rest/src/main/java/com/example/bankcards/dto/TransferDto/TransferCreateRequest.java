package com.example.bankcards.dto.TransferDto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TransferCreateRequest {
    private int toCardId;
    private int fromCardId;

    private float amount;

    private String description;
    private LocalDateTime time;

    private boolean isSameCard() {
        return false;  // Это будет проверяться в сервисе с fromCardId
    }
}
