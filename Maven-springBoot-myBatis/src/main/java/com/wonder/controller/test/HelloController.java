package com.wonder.controller.test;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
//@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
    	System.out.println("Hello World!");
        return "Hello World!";
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(HelloController.class, args);
//    }
}


