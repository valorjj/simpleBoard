package com.jeongjin.simple_board.member.dto;


import com.jeongjin.simple_board.member.domain.MemberEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberResponseDTO {

    private Long id;
    private String name;
    private String email;

    public MemberResponseDTO(MemberEntity memberEntity) {
        this.id = memberEntity.getId();
        this.email = memberEntity.getEmail();
        this.name = memberEntity.getName();
    }

}
