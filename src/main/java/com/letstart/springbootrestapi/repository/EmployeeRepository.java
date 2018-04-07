package com.letstart.springbootrestapi.repository;

import com.letstart.springbootrestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
