package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParaController {
    @RequestMapping(value = "/helloWorld",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String Para() {
        return "hello world";
    }
}
