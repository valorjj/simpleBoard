package com.jeongjin.simple_board.member.dto;


import com.jeongjin.simple_board.member.domain.MemberEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MemberRequestDTO {

    @Email(message = "INVALID_EMAIL")
    @NotBlank(message = "EMAIL_IS_MANDATORY")
    private String email;

    @NotBlank(message = "PASSWORD_IS_MANDATORY")
    private String password;

    @NotBlank(message = "NAME_IS_MANDATORY")
    private String name;

    public MemberEntity toEntity() {
        return MemberEntity.builder()
                .email(email)
                .password(password)
                .name(name)
                .active("Y")
                .deleted("N")
                .build();
    }

    @Override
    public String toString() {
        return email + ", " + password + ", " + name;

    }


}
