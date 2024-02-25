package org.sparta.memo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 추상 클래스에 선언한 멤버 변수를 컬럼으로 인식해줌
@EntityListeners(AuditingEntityListener.class) // 자동으로 시간을 넣어주는 기능이 수행
public abstract class Timestamped {

    @CreatedDate
    @Column(updatable = false) // update가 되지 않음
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @LastModifiedDate // 해당 변경 시간으로 update
    @Column
    @Temporal(TemporalType.TIMESTAMP) // date, calendar 날짜 매핑할 때 사용
    private LocalDateTime modifiedAt;

//    데이터베이스의 시간 타입 3가지
//    DATE : 2023-01-01
//    TIME : 20:21:14
//    TIMESTAMP : 2023-01-01 20:21:14.993939

}