package com.graphql.demo.controller.impl.mapping;

import com.graphql.demo.controller.impl.response.EmployeeResponse;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeMappingController {

    @SchemaMapping
    public String fullName(final EmployeeResponse employeeResponse) {
        return String.format("%s %s", employeeResponse.getName(), employeeResponse.getSurname());
    }
}
