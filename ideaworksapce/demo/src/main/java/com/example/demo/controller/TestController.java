package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/getUserByGet", method = RequestMethod.GET)
    String getUserByGet() {
        return "Hello " ;
    }

    @RequestMapping(value = "/getUserByGet11", method = RequestMethod.GET)
    String getUserByGet1() {
        return "Hello " ;
    }


}
