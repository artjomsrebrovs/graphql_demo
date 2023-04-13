package com.graphql.demo.controller;

import com.graphql.demo.controller.impl.response.EmployeeResponse;
import org.springframework.http.ResponseEntity;

public interface EmployeeRestController {

    ResponseEntity<EmployeeResponse> getEmployeeFullNameById(Long id);
}
