package com.graphql.demo.controller;

import com.graphql.demo.controller.impl.request.DepartmentNameRequest;
import com.graphql.demo.controller.impl.request.EmployeeFullNameRequest;
import com.graphql.demo.controller.impl.request.EmployeeRequest;
import com.graphql.demo.controller.impl.response.EmployeeResponse;
import com.graphql.demo.entity.Employee;

import java.util.List;

public interface EmployeeController {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee getEmployeeByNameAndSurname(EmployeeFullNameRequest employeeFullNameRequest);

    EmployeeResponse getEmployeeFullNameById(Long id);

    List<Employee> getEmployeesByDepartmentName(DepartmentNameRequest departmentNameRequest);

    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
}
