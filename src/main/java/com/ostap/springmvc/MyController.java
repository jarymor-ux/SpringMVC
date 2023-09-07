package com.ostap.springmvc;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){

        return "first_view";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask_details";
    }
    @RequestMapping("/showDetails")
    public String showDetails(){
        return "show_details";
    }
}
