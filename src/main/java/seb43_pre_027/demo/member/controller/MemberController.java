package seb43_pre_027.demo.member.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import seb43_pre_027.demo.member.mapper.MemberMapper;
import seb43_pre_027.demo.member.service.MemberService;
import seb43_pre_027.demo.member.dto.MemberPostDto;
import seb43_pre_027.demo.member.entity.Member;
import seb43_pre_027.demo.question.entity.Question;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@RestController
@RequestMapping("/member")
@CrossOrigin()
public class MemberController {

    MemberService memberService;
    MemberMapper mapper;

    public MemberController(MemberService memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") @Positive long memberId){
        return null;
    }
    @PostMapping
    public ResponseEntity SignUp(@Valid @RequestBody MemberPostDto memberPostDto){
        Member member = mapper.memberPostDtoToMember(memberPostDto);
        memberService.createMember(member);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @PatchMapping
    public ResponseEntity updateMember(){
        return null;
    }

    //뭔매핑해야하지
//    @GetMapping("/{member-id}")
//    public ResponseEntity getMyQuestion(@PathVariable("member-id") long memberId){
//        Member member = memberService.getMember(memberId);
//        List<Question> questions = member.getQuestions();
//
//        return null;
//    }
//    @GetMapping
//    public ResponseEntity getMyComment(){
//     return null;
//    }
}
