package com.jeongjin.simple_board.member.service;


import com.jeongjin.simple_board.member.domain.MemberEntity;
import com.jeongjin.simple_board.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /**
     * @param memberEntity
     * @return
     */
    @Override
    public MemberEntity save(MemberEntity memberEntity) {
        return memberRepository.save(memberEntity);
    }

    /**
     * @param memberId
     * @return
     */
    @Transactional
    @Override
    public MemberEntity search(Long memberId) {
        return memberRepository.findById(memberId).get();
    }

    /**
     * @param memberEntity
     */
    @Override
    public void update(MemberEntity memberEntity) {

    }

    /**
     * @param memberId
     */
    @Override
    public void delete(Long memberId) {

    }
}
