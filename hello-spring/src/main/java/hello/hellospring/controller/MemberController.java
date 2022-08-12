package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// 스프링 컨테이너에 Controller 객체를 생성해 넣어둔다. 스프링 빈이 관리된다.
@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired // spring이 컨테이너에 있는 memberService를 가져다 연결해준다. 생성자 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

//    @Autowired // setter 주입, public 노출 문제 발생
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
    
}
