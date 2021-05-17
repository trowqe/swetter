package com.example.swetter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           @RequestParam(name="name2", required=false, defaultValue="World2") String name2,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("name2", name2);
        return "greeting";
    }
}
