package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello") // web application에서 /hello가 들어오면 아래 method 호출
    public String hello(Model model) { // spring이 model을 만들어 넣어줌
        model.addAttribute("data", "hello!!");
        return "hello"; // templates/hello.html 화면을 실행
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // http body에 직접 넣어줌
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
        //template engine과는 다름, view가 없고 위 데이터 그대로가 내려감
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // JSON으로 변환됨
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
