package com.graphql.demo.controller.impl.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeeRequest {

    private String name;

    private String surname;

    private DepartmentRequest departmentRequest;

    private LocalDate employmentDate;

    private Boolean active;

    private PositionRequest positionRequest;

}
