package com.example.bankcards.dto.UserDto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String phone;
    private String firstname;
    private String secondname;
}
