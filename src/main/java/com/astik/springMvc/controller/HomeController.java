package com.astik.springMvc.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String Home()
    {
        return "index";
    }
    @PostMapping("/add")
    public String Add(@RequestParam("num1")int n1, @RequestParam("num2")int n2, Model model)
    {
        model.addAttribute("result",n1+n2);
        return "result";
    }

}
