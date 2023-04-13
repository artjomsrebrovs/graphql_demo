package com.graphql.demo.controller.impl;

import com.graphql.demo.controller.EmployeeRestController;
import com.graphql.demo.controller.impl.response.EmployeeResponse;
import com.graphql.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestControllerImpl implements EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestControllerImpl(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeFullNameById(@PathVariable("id") final Long id) {
        return new ResponseEntity<>(employeeService.getEmployeeFullNameById(id), HttpStatus.OK);
    }

}
