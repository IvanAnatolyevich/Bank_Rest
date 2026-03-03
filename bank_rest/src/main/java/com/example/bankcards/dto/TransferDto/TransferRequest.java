package com.example.bankcards.dto.TransferDto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TransferRequest {
    private int toCardId;
    private int fromCardId;

    private float amount;

    private String description;

    private boolean isSameCard() {
        return false;  // Это будет проверяться в сервисе с fromCardId
    }
}
