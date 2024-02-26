package com.sparta.exam.service;

import com.sparta.exam.dto.UserResponseDto;
import com.sparta.exam.entity.User;
import com.sparta.exam.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUserId(Long userId) {
        return userRepository.findByUserid(userId).orElseThrow(() ->
                new IllegalArgumentException("선택하신 유저는 존재하지 않습니다.")
        );
    }

    public List<UserResponseDto> getUsers() {
        return userRepository.findAll().stream().map(UserResponseDto::new).toList();
    }
}
