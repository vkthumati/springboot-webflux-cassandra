package com.thumati.springbootwebfluxcassandra.repositories;

import com.thumati.springbootwebfluxcassandra.domain.Employee;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

//ReactiveCrudRepository<Employee, Integer>
public interface EmployeeReactiveRepository extends ReactiveCassandraRepository<Employee, Integer>  {

}
