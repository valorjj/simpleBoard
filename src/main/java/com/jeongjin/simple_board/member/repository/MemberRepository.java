package com.jeongjin.simple_board.member.repository;

import com.jeongjin.simple_board.member.domain.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    Optional<MemberEntity> findById(Long memberId);
    

}
