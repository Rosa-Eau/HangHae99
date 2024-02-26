package com.sparta.exam.dto;

import lombok.Getter;

@Getter
public class UserRequestDto {
    private Long userId;
    private String name;
    private String email;
    private String pw;
}
