package com.chtw.cidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/state")
    public Map<String, String> test(){
        Map<String, String> res = new HashMap<>();
        res.put("code", "0");
        res.put("msg", "server is ok");
        res.put("data", "hello ci demo v2");
        return res;
    }
}
