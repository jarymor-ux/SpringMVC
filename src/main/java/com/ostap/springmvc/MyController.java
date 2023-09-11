package com.ostap.springmvc;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
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
    public String showDetails(HttpServletRequest request, Model model){
        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);



        return "show_details";
    }
}
