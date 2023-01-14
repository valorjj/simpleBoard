package com.jeongjin.simple_board.common.controller;


import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }
}
