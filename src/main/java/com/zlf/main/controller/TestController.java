package com.zlf.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanglf
 * @Date 2022/5/15 7:17 上午
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("test")
    public String test() {
        return "hello azure devops";
    }
}
