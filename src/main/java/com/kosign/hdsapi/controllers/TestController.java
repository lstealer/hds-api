package com.kosign.hdsapi.controllers;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @RequestMapping("hello")
    public String hello(){
        return "hello world!!!";
    }
}
