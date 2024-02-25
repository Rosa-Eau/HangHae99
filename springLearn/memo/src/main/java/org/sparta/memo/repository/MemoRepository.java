package org.sparta.memo.repository;

import org.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc(); // ModifiedAt을 내림차순으로 전부 찾아줘
    List<Memo> findByContentsContainsOrderByModifiedAtDesc(String contents);
}
