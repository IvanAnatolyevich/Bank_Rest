package com.example.bankcards.mapper;

import com.example.bankcards.dto.UserDto.UserCreateRequest;
import com.example.bankcards.dto.UserDto.UserDto;
import com.example.bankcards.dto.UserDto.UserResponse;
import com.example.bankcards.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T11:57:42+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userRequestToUser(UserCreateRequest userCreateRequest) {
        if ( userCreateRequest == null ) {
            return null;
        }

        User user = new User();

        user.setPhone( userCreateRequest.getPhone() );
        user.setFirstname( userCreateRequest.getFirstname() );
        user.setSecondname( userCreateRequest.getSecondname() );

        return user;
    }

    @Override
    public UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        if ( user.getId() != null ) {
            userDto.setId( user.getId() );
        }
        userDto.setPhone( user.getPhone() );
        userDto.setFirstname( user.getFirstname() );
        userDto.setSecondname( user.getSecondname() );

        return userDto;
    }

    @Override
    public UserResponse userToUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setPhone( user.getPhone() );
        userResponse.setFirstname( user.getFirstname() );
        userResponse.setSecondname( user.getSecondname() );

        return userResponse;
    }
}
