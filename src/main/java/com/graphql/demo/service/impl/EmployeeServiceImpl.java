package com.graphql.demo.service.impl;

import com.graphql.demo.controller.impl.request.EmployeeRequest;
import com.graphql.demo.controller.impl.response.EmployeeResponse;
import com.graphql.demo.entity.Employee;
import com.graphql.demo.repository.EmployeeRepository;
import com.graphql.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(final Long id) {
        return employeeRepository.findById(id).orElseGet(Employee::new);
    }

    @Override
    public Employee getEmployeeByNameAndSurname(final String name, final String surname) {
        return employeeRepository.findByNameAndSurname(name, surname);
    }

    @Override
    public EmployeeResponse getEmployeeFullNameById(Long id) {
        final Employee employee = employeeRepository.findById(id).orElseGet(Employee::new);
        return new EmployeeResponse(employee);
    }

    @Override
    public List<Employee> getEmployeesByDepartmentName(final String departmentName) {
        return employeeRepository.findByDepartmentName(departmentName);
    }

    @Override
    public EmployeeResponse createEmployee(final EmployeeRequest employeeRequest) {
        final Employee employee = employeeRepository.save(new Employee(employeeRequest));
        return new EmployeeResponse(employee);
    }
}