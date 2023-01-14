package com.jeongjin.simple_board.member.controller;


import com.jeongjin.simple_board.common.domain.ErrorResponse;
import com.jeongjin.simple_board.member.domain.MemberEntity;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MemberController {

    @GetMapping("/get/members")
    public List<MemberEntity> getMembers() {


        return null;
    }

    @GetMapping("/get/member/{id}")
    public MemberEntity getMember(@PathVariable Integer id) {


        return null;
    }

    @PostMapping("/save/member")
    public ResponseEntity<?> saveMember(@Validated @RequestBody final MemberEntity member, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getAllErrors().stream().map(
                    DefaultMessageSourceResolvable::getDefaultMessage).toList();
            return ResponseEntity.ok(new ErrorResponse("404", "Validation Failed", errors));
        }
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/update/member")
    public ResponseEntity<MemberEntity> updateMember(@RequestBody MemberEntity member) {


        return null;
    }

    @DeleteMapping("/delete/member/{id}")
    public ResponseEntity<MemberEntity> deleteMember(@PathVariable Integer id) {


        return null;
    }


}
