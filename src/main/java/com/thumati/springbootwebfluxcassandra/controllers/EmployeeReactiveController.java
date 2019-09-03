package com.thumati.springbootwebfluxcassandra.controllers;

import com.thumati.springbootwebfluxcassandra.domain.Employee;
import com.thumati.springbootwebfluxcassandra.services.EmployeeReactiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class EmployeeReactiveController {

    @Autowired
    private EmployeeReactiveService service;

    @GetMapping("/employees")
    public Flux<Employee> getAllEmployees(){
        Flux<Employee> employeeFlux = service.getAllEmployees();
        return employeeFlux;
    }
}
