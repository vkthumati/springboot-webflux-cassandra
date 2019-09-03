package com.thumati.springbootwebfluxcassandra.services;

import com.thumati.springbootwebfluxcassandra.domain.Employee;
import reactor.core.publisher.Flux;

public interface EmployeeReactiveService {

    Flux<Employee> getAllEmployees();
}
