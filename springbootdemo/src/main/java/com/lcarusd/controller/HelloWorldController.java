package com.lcarusd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;

@RestController
public class HelloWorldController {

    @RequestMapping()
    public String index() {
        return "Hello Lcarusd!";
    }

    @RequestMapping("/index")
    public String root(ModelMap map) {
        map.addAttribute("message", "http://www.lcarusd.cn");
        return "this is index page!";
    }


}
