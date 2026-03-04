package com.example.bankcards.mapper;

import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.entity.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserMapper {

    public static User userRequestToUser(UserCreateRequest userCreateRequest) {
        User user = new User();
        user.setFirstname(userCreateRequest.getFirstname());
        user.setSecondname(userCreateRequest.getSecondname());
        user.setPhone(userCreateRequest.getPhone());
        return user;
    }

    public static UserDto userToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setPhone(user.getPhone());
        userDto.setFirstname(user.getFirstname());
        userDto.setSecondname(user.getSecondname());
        return userDto;
    }
}
