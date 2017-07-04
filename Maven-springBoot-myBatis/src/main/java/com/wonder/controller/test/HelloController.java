package com.wonder.controller.test;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
//@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String home(HttpServletRequest request,HttpServletResponse response) {
    	System.out.println("Hello World!");
    	System.out.println(request.getAttribute("name"));
        return "Hello World!";
    }
    
    @RequestMapping("/index")
    public String index(ModelMap map, HttpServletRequest request,HttpServletResponse response) {
    	System.out.println(request.getAttribute("name"));
    	map.put("name", request.getAttribute("name"));
        return "index";
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(HelloController.class, args);
//    }
}


