package com.sparta.springpripare;

import lombok.*;



// 기본 생성자와 모든 필드를 파라미터로 가진 오버로딩된 생성자 만들어줌
@AllArgsConstructor
// 파라미터가 없는 기본 생성자 만들어줌
@NoArgsConstructor
// final 제어자가 붙은 필드를 파라미터로 가진 오버로딩된 생성자 만들어줌
@RequiredArgsConstructor
// get…() 메서드 만들어줌
@Getter
// set…() 메서드 만들어줌
@Setter
public class Memo {
    private String username;
    private String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setUsername("Robbie");
        System.out.println(memo.getUsername());
    }
}
