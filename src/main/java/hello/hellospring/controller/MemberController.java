package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    // Autowired 가 있으면 자동으로 memberService를 가져다가 연결시켜줌
    // 꼭 써야함 DI
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
