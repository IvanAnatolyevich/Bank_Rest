package com.example.bankcards.dto.UserDto;

import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class UserCreateRequest {
    private String phone;
    private String firstname;
    private String secondname;
}
