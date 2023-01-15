package com.jeongjin.simple_board.member.service;


import com.jeongjin.simple_board.member.domain.MemberEntity;
import com.jeongjin.simple_board.member.repository.MemberRepository;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public MemberEntity save(MemberEntity memberEntity) {
        return memberRepository.save(memberEntity);
    }

    /**
     * @param memberId
     * @return
     */
    @Override
    public MemberEntity search(Long memberId) {
        return memberRepository.findById(memberId).get();
    }
}
