package com.jeongjin.simple_board.common.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    NOT_FOUND(404, "COMMON-ERROR-404", "PAGE NOT FOUND"),
    INTER_SERVER_ERROR(500, "COMMON-ERROR-500", "INTER SERVER ERORR"),
    EMAIL_DUPLICATION(400, "MEMBER-EMAIL-ERROR-400", "EMAIL DUPLICATED"),
    EMAIL_INVALID(400, "EMAIL-INVALID-400", "INVALID EMAIL");

    private int statusCode;
    private String errorContent;
    private String message;

}
