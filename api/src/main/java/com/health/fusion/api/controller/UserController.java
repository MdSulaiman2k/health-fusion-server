package com.health.fusion.api.controller;


import com.health.fusion.api.dto.UserRequestDto;
import com.health.fusion.api.dto.UserResponseDto;
import com.health.fusion.api.mapper.UserMapper;
import com.health.fusion.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;


    @PostMapping
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        var user = userMapper.mapUserRequestDtoToUser(userRequestDto);
        return userMapper.mapUserToUserResponseDto(userService.createUser(user));
    }

}
