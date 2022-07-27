package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // web application에서 /hello가 들어오면 아래 method 호출
    public String hello(Model model) { // spring이 model을 만들어 넣어줌
        model.addAttribute("data", "hello!!");
        return "hello"; // templates/hello.html 화면을 실행
    }
}
