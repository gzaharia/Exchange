package com.practiceTask.exchange.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "employees")
public class Employee {

    @Id
    private Long id;

    @Column(value = "name_of_employee")
    private String nameOfEmployee;

    @Column(value = "number_of_employee")
    private String nunmberOfEmployee;

}




