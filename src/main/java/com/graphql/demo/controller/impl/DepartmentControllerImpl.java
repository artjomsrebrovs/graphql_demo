package com.graphql.demo.controller.impl;

import com.graphql.demo.controller.DepartmentController;
import com.graphql.demo.entity.Department;
import com.graphql.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DepartmentControllerImpl implements DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentControllerImpl(final DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    @QueryMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
