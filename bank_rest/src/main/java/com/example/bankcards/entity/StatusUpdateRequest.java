package com.example.bankcards.entity;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class StatusUpdateRequest {
    private String reason;
    private Status status;
}
