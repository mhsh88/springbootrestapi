package com.letstart.springbootrestapi;

import com.letstart.springbootrestapi.dao.BaseDAORepository;
import com.letstart.springbootrestapi.dao.BaseService;
import com.letstart.springbootrestapi.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(scanBasePackages={"com.letstart.springbootrestapi.dao","com.letstart.springbootrestapi.controller"})
@EnableJpaAuditing
@EnableJpaRepositories(basePackageClasses = {BaseDAORepository.class, EmployeeRepository.class})
@EntityScan(value = "com.letstart.springbootrestapi.model", basePackageClasses = BaseService.class)
@Configuration
@ComponentScan(basePackages = {"com.letstart.springbootrestapi.dao","com.letstart.springbootrestapi.controller"}, basePackageClasses = {BaseService.class})
public class EmployeeApplication {
    public static void main (String[] args){

        SpringApplication.run(EmployeeApplication.class, args);
    }
}
