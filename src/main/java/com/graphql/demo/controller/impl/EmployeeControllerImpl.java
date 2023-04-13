package com.graphql.demo.controller.impl;

import com.graphql.demo.controller.EmployeeController;
import com.graphql.demo.controller.impl.request.DepartmentNameRequest;
import com.graphql.demo.controller.impl.request.EmployeeFullNameRequest;
import com.graphql.demo.controller.impl.request.EmployeeRequest;
import com.graphql.demo.controller.impl.response.EmployeeResponse;
import com.graphql.demo.entity.Employee;
import com.graphql.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeControllerImpl implements EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeControllerImpl(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    @QueryMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @Override
    @QueryMapping
    public Employee getEmployeeById(@Argument final Long id) {
        return employeeService.findById(id);
    }

    @Override
    @QueryMapping
    public Employee getEmployeeByNameAndSurname(@Argument final EmployeeFullNameRequest employeeFullNameRequest) {
        return employeeService.getEmployeeByNameAndSurname(employeeFullNameRequest.getName(), employeeFullNameRequest.getSurname());
    }

    @Override
    @QueryMapping
    public EmployeeResponse getEmployeeFullNameById(@Argument final Long id) {
        return employeeService.getEmployeeFullNameById(id);
    }

    @Override
    @QueryMapping
    public List<Employee> getEmployeesByDepartmentName(@Argument final DepartmentNameRequest departmentNameRequest) {
        return employeeService.getEmployeesByDepartmentName(departmentNameRequest.getDepartmentName());
    }

    @Override
    @MutationMapping
    public EmployeeResponse createEmployee(@Argument final EmployeeRequest employeeRequest) {
        return employeeService.createEmployee(employeeRequest);
    }
}
