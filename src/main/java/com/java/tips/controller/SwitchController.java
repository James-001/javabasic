package com.java.tips.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yto on 2019/8/1.
 */
@Controller
public class SwitchController {

    @RequestMapping("/hi")
    public String sayHello() {
        return "hello.html";
    }
}
