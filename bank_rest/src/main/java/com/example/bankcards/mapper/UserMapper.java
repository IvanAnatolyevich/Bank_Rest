package com.example.bankcards.mapper;

import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.dto.UserDto.UserResponse;
import com.example.bankcards.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userRequestToUser(UserCreateRequest userCreateRequest);

    UserDto userToUserDto(User user);

    UserResponse userToUserResponse(User user);
}
