package com.example.employee_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "employee-list";
    }

    @GetMapping("/add-employee")
    public String addEmployee() {
        return "add-employee";
    }

    @GetMapping("/employee-list")
    public String employeeList() {
        return "employee-list";
    }

    @GetMapping("/edit-employee")
    public String editEmployee() {
        return "edit-employee";
    }
}