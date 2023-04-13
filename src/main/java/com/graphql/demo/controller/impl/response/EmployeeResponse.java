package com.graphql.demo.controller.impl.response;

import com.graphql.demo.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

    private Long id;

    private String name;

    private String surname;

    private String fullName;

    public EmployeeResponse(final Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.surname = employee.getSurname();
    }

//    public String getFullName() {
//        return String.format("%s %s", name, surname);
//    }
}
