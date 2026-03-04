package com.example.bankcards.dto.TransferDto;

import com.example.bankcards.entity.User;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TransferDto {
    private int transferId;
    private int toCardId;
    private int fromCardId;

    private float amount;

    private String description;
    private LocalDateTime time;
}
