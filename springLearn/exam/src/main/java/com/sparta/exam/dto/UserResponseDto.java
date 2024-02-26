package com.sparta.exam.dto;

import com.sparta.exam.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {

    private Long userId;
    private String name;
    private String email;
    private String pw;

    public UserResponseDto(User user) {
        this.userId = user.getUserid();
        this.name = user.getName();
        this.email = user.getEmail();
        this.pw = user.getPw();
    }
}