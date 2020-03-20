package com.example.controller;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/EmployeeController")
@RestController
public class EmployeeController {


    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView readStudent(ModelAndView model) throws IOException {

        List<Employee> listEmployee = employeeDao.getEmployees();
        model.addObject("listEmployee", listEmployee);
        model.setViewName("read");
        return model;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createEmployee(@RequestParam("id") int id,@RequestParam("name") String name,
                                       @RequestParam("department") String department , ModelAndView mv) {

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setDepartment(department);

        int performed = employeeDao.save(employee);

        if (performed > 0) {
            mv.addObject("msg", "Employee registration successful.");
        } else {
            mv.addObject("msg", "Error- check the console log.");
        }

        mv.setViewName("create");

        return mv;
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView updateEmployee(@RequestParam("id") int id, @RequestParam("name") String name,
                                       @RequestParam("department") String department, ModelAndView mv) {

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setDepartment(department);

        int performed = employeeDao.update(employee);

        if (performed > 0) {
            mv.addObject("msg", "Employee records updated against Employee Id: " + employee.getId());
        } else {
            mv.addObject("msg", "Error- check the console log.");
        }

        mv.setViewName("update");

        return mv;
    }

    @RequestMapping(value = "/delete/{employeeId}")
    public ModelAndView deleteStudentById(ModelAndView mv, @PathVariable("employeeId") int employeeId)
            throws IOException {

        int performed = employeeDao.delete(employeeId);

        if (performed > 0) {
            mv.addObject("msg", "Employee records deleted against Employee Id: " + employeeId);
        } else {
            mv.addObject("msg", "Error- check the console log.");
        }

        mv.setViewName("delete");

        return mv;
    }

}
