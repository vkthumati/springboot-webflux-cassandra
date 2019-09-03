package com.thumati.springbootwebfluxcassandra.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType
public class Address {
    private Integer employee_id;
    private String residence_address;
    private String office_address;
    private String city;
}
