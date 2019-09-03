package com.thumati.springbootwebfluxcassandra.domain;

import com.datastax.driver.core.DataType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @PrimaryKey
    private Integer employee_id;

    private String name;

    private String salary;

    @CassandraType(type = DataType.Name.UDT, userTypeName = "address")
    private Address address;
}
