package com.wenjie.album.controller;


import com.wenjie.album.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {

        TestService testService = new TestService();
      String age  =   testService.getAge();
        return "Hello Word!" + age;
    }

}
