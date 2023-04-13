package com.graphql.demo.repository;

import com.graphql.demo.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findAll();

    Employee findByNameAndSurname(String name, String surname);

    List<Employee> findByDepartmentName(String departmentName);
}
