package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Chicken implements Food {
    @Override
    @Primary
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}