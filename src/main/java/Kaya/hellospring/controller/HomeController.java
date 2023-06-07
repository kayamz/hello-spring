package Kaya.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")    // 도메인 처음 localhost:8080 들어오면 처음 실행되게끔
    public String home() {
        return "home";      // home.html이 실행됨
    }
}
