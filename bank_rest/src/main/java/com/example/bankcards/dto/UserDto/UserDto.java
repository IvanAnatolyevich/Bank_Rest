package com.example.bankcards.dto.UserDto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class UserDto {
    private int id;
    private String phone;
    private String firstname;
    private String secondname;

}
