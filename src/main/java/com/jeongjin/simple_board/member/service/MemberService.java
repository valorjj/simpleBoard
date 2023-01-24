package com.jeongjin.simple_board.member.service;


import com.jeongjin.simple_board.member.domain.MemberEntity;

public interface MemberService {

    // SAVE
    MemberEntity save(MemberEntity memberEntity);

    // SEARCH
    MemberEntity search(Long memberId);


    // UPDATE
    void update(MemberEntity memberEntity);

    // DELETE
    void delete(Long memberId);


}
