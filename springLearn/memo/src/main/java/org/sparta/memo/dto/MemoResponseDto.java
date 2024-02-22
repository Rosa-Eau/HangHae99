package org.sparta.memo.dto;

import lombok.Getter;
import org.sparta.memo.entity.Memo;

@Getter
public class MemoResponseDto {
    private final Long id;
    private final String username;
    private final String contents;

    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.username = memo.getUsername();
        this.contents = memo.getContents();
    }
}