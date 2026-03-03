package com.example.bankcards.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private List<Card> listCard;
    private Role role;

}
