package com.jeongjin.simple_board.common.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ErrorResponse {

    private String statusCode;
    private String errorContent;
    private List<String> messages;

    /**
     * @param statusCode
     * @param errorContent
     * @param message
     */
    public ErrorResponse(String statusCode, String errorContent, String message) {
        this.statusCode = statusCode;
        this.errorContent = errorContent;
        this.messages = new ArrayList<>();
        this.messages.add(message);
    }

    /**
     * @param statusCode
     * @param errorContent
     * @param message
     */
    public ErrorResponse(String statusCode, String errorContent, List<String> message) {
        this.statusCode = statusCode;
        this.errorContent = errorContent;
        this.messages = message;
    }


}
