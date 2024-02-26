package com.sparta.exam.controller;

import com.sparta.exam.dto.UserResponseDto;
import com.sparta.exam.entity.User;
import com.sparta.exam.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class UserController {

    private final UserService userService;

    // 단건 조회
    @GetMapping("/user/{userId}")
    public User getUserInfo(@PathVariable Long userId) {
        return userService.getUserId(userId);
    }

    // 전체 목록 조회
    @GetMapping("/user")
    public List<UserResponseDto> getUserList() {
        return userService.getUsers();
    }

}