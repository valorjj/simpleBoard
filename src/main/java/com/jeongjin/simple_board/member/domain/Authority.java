package com.jeongjin.simple_board.member.domain;


import lombok.Getter;

@Getter
public enum Authority {

    ROLE_ADMIN("ROLE_ADMIN", "ADMIN AUTH", 10001),
    ROLE_USER("ROLE_USER", "common user", 10002),
    ROLE_MASTER("ROLE_MASTER", "master auth", 10003);

    private String auth;
    private String desc;
    private int authCode;

    Authority(String auth, String desc, int authCode) {
        this.auth = auth;
        this.desc = desc;
        this.authCode = authCode;
    }
}
