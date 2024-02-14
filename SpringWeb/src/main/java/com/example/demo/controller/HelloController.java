package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import  com.example.demo.model.EmployeeRepository;
@Controller
public class HelloController {

    //EmployeeRepo:Database
    @Autowired
    @EmployeeRepository emprep;

    //Map:home
    @RequestMapping("/home")
    public String displayHome(){
        System.out.println("Coming here");
        return "Main";
    }

    //Map:empdata
    @RequestMapping("/EmpData")
    public ModelAndView getEmpData(){
        Employee emp = new Employee();
        emp.setEmpid(1);
        emp.setEmpname("Mark");
        emp.setSalary(80000);
        return new ModelAndView("EmployeeDetails", "eobj", emp);
    }

    //Map:empform
    @RequestMapping("/empform")
    public ModelAndView displayForm(){
        return new ModelAndView("EmployeeForm", "eobj", new Employee());
    }

    //Map:saveData
    @RequestMapping("/saveData")
    public String saveEmp(@ModelAttribute("eobj") Employee e1){
        System.out.println("Employee id is " + e1.getEmpid());
        System.out.println("Employee name is " + e1.getEmpname());

        //employee -> db.repo
        emprep.save(e1);
        System.out.println("Data saved");
        return "success";
    }


    //Map:retrieve
    @RequestMapping("/retrieve")
    public ModelAndView retrieveData(){
        List<Employee> empList = emprep.findAll();
        return new ModelAndView("EmployeeData", "elist", emplist);
    }
}
