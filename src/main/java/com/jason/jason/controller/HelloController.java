package com.jason.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
//        @RequestParam(name = "name")是接收前端传来的参数
//        然后可以渲染在模板上面，加上下面的 model.addAttribute("name",name)
        model.addAttribute("name",name);
        return "hello";

    }
}
