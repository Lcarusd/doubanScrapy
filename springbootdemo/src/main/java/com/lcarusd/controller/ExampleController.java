package com.lcarusd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import com.lcarusd.model.User;

import java.util.*;

@Controller
public class ExampleController {

    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "ityouknow");
        return "string";
    }

    @RequestMapping("/list")
    public String list(ModelMap map) {
        map.addAttribute("users", getUserList());
        return "list";
    }

    private List<User> getUserList() {
        List<User> list = new ArrayList<User>();
        User user1 = new User("星夜", 18, "111");
        User user2 = new User("Lcarusd", 3, "222");
        User user3 = new User("stogie", 2, "333");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
