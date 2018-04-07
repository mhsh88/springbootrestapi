package com.letstart.springbootrestapi.controller;


import com.letstart.springbootrestapi.dao.EmployeeDAO;
import com.letstart.springbootrestapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/company")
public class EmployeeController {

    @Autowired
    EmployeeDAO employeeDAO;

    /* to save an employee */
    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee emp){
        return employeeDAO.save(emp);
    }


    /* get all employees */
    @GetMapping(value="/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployees(){
        return employeeDAO.findAll();
    }


    /* get employee by particular id */
    @GetMapping(value="/notes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long empId){
        Employee emp = employeeDAO.findOne(empId);
        if(emp == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(emp);
    }


    /* update an employee by empId */
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long empId, @Valid @RequestBody Employee empDetails){

    Employee emp = employeeDAO.findOne(empId);
    if(emp == null ){
        return ResponseEntity.notFound().build();
    }

    emp.setName(empDetails.getName());
    emp.setDesignation(empDetails.getDesignation());
    emp.setExpertise(empDetails.getExpertise());

    Employee updateEmployee = employeeDAO.save(emp);


    return ResponseEntity.ok().body(updateEmployee);

    }

    /* delete and employee */

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable(value = "id") Long empId){
        Employee emp = employeeDAO.findOne(empId);
        if(emp == null ){
            return ResponseEntity.notFound().build();
        }

        employeeDAO.delete(emp);

        return ResponseEntity.ok().build();
    }



}
