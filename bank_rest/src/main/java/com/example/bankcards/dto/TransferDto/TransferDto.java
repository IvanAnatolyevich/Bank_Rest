package com.example.bankcards.dto.TransferDto;

import com.example.bankcards.entity.User;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TransferDto {
    private int id;
    private User sender;
    private User recipient;
    private float amount;
    private int date;
}
