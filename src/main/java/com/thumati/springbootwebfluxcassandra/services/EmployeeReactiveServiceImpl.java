package com.thumati.springbootwebfluxcassandra.services;

import com.thumati.springbootwebfluxcassandra.domain.Employee;
import com.thumati.springbootwebfluxcassandra.repositories.EmployeeReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class EmployeeReactiveServiceImpl implements EmployeeReactiveService {

    @Autowired
    private EmployeeReactiveRepository repository;

    @Override
    public Flux<Employee> getAllEmployees() {
        return repository.findAll();
    }
}
