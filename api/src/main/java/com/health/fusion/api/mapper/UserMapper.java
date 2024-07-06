package com.health.fusion.api.mapper;

import com.health.fusion.api.dto.UserRequestDto;
import com.health.fusion.api.dto.UserResponseDto;
import com.health.fusion.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

  public User mapUserRequestDtoToUser(UserRequestDto userRequestDto) {
    return User.builder().name(userRequestDto.getName())
            .email(userRequestDto.getEmail())
            .phoneNumber(userRequestDto.getPhoneNumber())
            .build();
  }

  public UserResponseDto mapUserToUserResponseDto(User user) {
    return UserResponseDto.builder().id(user.getId())
            .name(user.getName())
            .email(user.getEmail())
            .phoneNumber(user.getPhoneNumber())
            .build();
  }


}
