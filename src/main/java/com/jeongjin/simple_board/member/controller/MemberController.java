package com.jeongjin.simple_board.member.controller;


import com.jeongjin.simple_board.common.domain.ErrorCode;
import com.jeongjin.simple_board.common.domain.ErrorResponse;
import com.jeongjin.simple_board.member.domain.MemberEntity;
import com.jeongjin.simple_board.member.dto.MemberRequestDTO;
import com.jeongjin.simple_board.member.dto.MemberResponseDTO;
import com.jeongjin.simple_board.member.service.MemberService;
import com.jeongjin.simple_board.member.service.MemberServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
// @Slf4j
public class MemberController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final MemberServiceImpl memberServiceImpl;

    public MemberController(MemberServiceImpl memberServiceImpl) {
        this.memberServiceImpl = memberServiceImpl;
    }

    /**
     * @return
     */
    @GetMapping("/get/members")
    public List<MemberEntity> getMembers() {


        return null;
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/get/member/{id}")
    public MemberEntity getMember(@PathVariable Integer id) {


        return null;
    }

    /**
     * @param memberRequestDTO
     * @param bindingResult
     * @return
     */
    @PostMapping("/save/member")
    public ResponseEntity<?> saveMember(@Validated @RequestBody final MemberRequestDTO memberRequestDTO, BindingResult bindingResult) {
        // 유효성 검사를 통과하지 못한 경우
        if (bindingResult.hasErrors()) {
            log.info("Some Error occurred while saving member");
            log.info("{}", bindingResult.getAllErrors());
            List<String> errors = bindingResult.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).toList();
            return ResponseEntity.ok(new ErrorResponse(ErrorCode.EMAIL_INVALID.getMessage(), ErrorCode.EMAIL_INVALID.getErrorContent(), ErrorCode.EMAIL_INVALID.getMessage()));
        }
        // 저장로직
        MemberEntity savedMemberEntity;
        try {
            log.info("{}", memberRequestDTO.toString());
            // insert
            savedMemberEntity = memberServiceImpl.save(memberRequestDTO.toEntity());
        } catch (Exception e) {
            return ResponseEntity.ok(new MemberResponseDTO(memberRequestDTO.toEntity()));
        }
        log.info("returning saved member info");
        return ResponseEntity.ok(
                new MemberResponseDTO(memberServiceImpl.search(savedMemberEntity.getId()))
        );
    }

    /**
     * @param member
     * @return
     */
    @PutMapping("/update/member")
    public ResponseEntity<MemberEntity> updateMember(@RequestBody MemberEntity member) {


        return null;
    }

    /**
     * @param memberId
     * @return
     */
    @DeleteMapping("/delete/member/{memberId}")
    public ResponseEntity<MemberEntity> deleteMember(@PathVariable Integer memberId) {


        return null;
    }


}
