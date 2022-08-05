package com.reservation_system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/ivan")
    @ResponseBody
    public  String index2(){ return "Ivan"; }

}
