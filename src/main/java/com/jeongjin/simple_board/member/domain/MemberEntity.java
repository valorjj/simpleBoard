package com.jeongjin.simple_board.member.domain;


import com.jeongjin.simple_board.common.domain.BaseTimeEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "member_email")
    // @Email(message = "INVALID_EMAIL")
    // @NotBlank(message = "EMAIL_IS_MANDATORY")
    private String email;

    @Column(name = "member_password")
    // @NotBlank(message = "PASSWORD_IS_MANDATORY")
    private String password;

    @Column(name = "member_name")
    // @NotBlank(message = "NAME_IS_MANDATORY")
    private String name;

    @Column(name = "member_active")
    private String active;

    @Column(name = "member_deleted")
    private String deleted;

    @Builder
    public MemberEntity(String email, String password, String name, String active, String deleted) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.active = active;
        this.deleted = deleted;
    }


}
