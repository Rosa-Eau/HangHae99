package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

//     Autowired -> 빈의 이름으로 찾음
//    @Autowired
//    Food pizza;
//
//    @Autowired
//    Food chicken;
//
//    @Test
//    @DisplayName("test")
//    void Test1() {
//        pizza.eat();
//        chicken.eat();
//    }

    @Autowired
    @Qualifier("pizza")
    Food food;


    @Test
    @DisplayName("Primary와 Qualifier 우선순위 확인")
    void test1(){
        food.eat();
        // Qualifier 가 우선
        // Spring 에서는 좁은 범위가 설정의 우선순위가 더 높음
    }


}
