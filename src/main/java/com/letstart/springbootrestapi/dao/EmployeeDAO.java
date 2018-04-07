package com.letstart.springbootrestapi.dao;

import com.letstart.springbootrestapi.model.Employee;
import com.letstart.springbootrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDAO {

    @Autowired
    EmployeeRepository employeeRepository;

    /* to save and employee*/

    public Employee save(Employee emp){
        return employeeRepository.save(emp);
    }

    /* search all employee*/

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    /* get an employee */

    public Employee findOne(Long empId){
        return employeeRepository.findOne(empId);
    }

    /*delete an employee */

    public void delete(Employee emp){
        employeeRepository.delete(emp);
    }
}
