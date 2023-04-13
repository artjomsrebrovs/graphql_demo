package com.graphql.demo.service;

import com.graphql.demo.controller.impl.request.EmployeeRequest;
import com.graphql.demo.controller.impl.response.EmployeeResponse;
import com.graphql.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee findById(Long id);

    Employee getEmployeeByNameAndSurname(String name, String surname);

    EmployeeResponse getEmployeeFullNameById(Long id);

    List<Employee> getEmployeesByDepartmentName(String departmentName);

    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
}
