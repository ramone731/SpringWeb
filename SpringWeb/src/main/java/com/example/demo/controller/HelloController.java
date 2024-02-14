package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/home")
    public String displayHome(){
        System.out.println("Coming here");
        return "Main";
    }
    @RequestMapping("/EmpData")
    public ModelAndView getEmpData(){
        Employee emp = new Employee();
        emp.setEmpid(1);
        emp.setEmpname("Mark");
        emp.setSalary(80000);
        return new ModelAndView("EmployeeDetails", "eobj");
    }
}
