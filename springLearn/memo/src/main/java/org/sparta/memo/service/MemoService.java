package org.sparta.memo.service;

import org.sparta.memo.dto.MemoRequestDto;
import org.sparta.memo.dto.MemoResponseDto;
import org.sparta.memo.entity.Memo;
import org.sparta.memo.repository.MemoRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MemoService {

    private final MemoRepository memoRepository;

    public MemoService(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }


    public MemoResponseDto createMemo(MemoRequestDto requestDto) {
        // RequestDto -> Entity
        Memo memo = new Memo(requestDto);

        // DB 저장
        Memo saveMemo = memoRepository.save(memo);

        // Entity -> ResponseDto
        return new MemoResponseDto(memo);
    }

    public List<MemoResponseDto> getMemos() {
        // DB 조회
        return memoRepository.findAll();
    }

    public Long updateMemo(Long id, MemoRequestDto requestDto) {
        // 해당 메모가 DB에 존재하는지 확인
        return memoRepository.update(id, requestDto);
    }

    public Long deleteMemo(Long id) {
        // 해당 메모가 DB에 존재하는지 확인
       return memoRepository.delete(id);
    }





}


