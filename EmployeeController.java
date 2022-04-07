package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private Employee_service service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Employee> listEmployee = service.listAll();
        model.addAttribute("listEmployee", listEmployee);

        return "index";
    }


    @RequestMapping(value = "/pra")
    public String showNewEmployeePage(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "new_student";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        service.Save(employee);
        return "redirect/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditEmployeePage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_Employee");
        Employee employee = service.get(id);
        mav.addObject("employee", employee);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";

    }
}



