package com.graphql.demo.entity;

import com.graphql.demo.controller.impl.request.EmployeeRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "surname", length = 50, nullable = false)
    private String surname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="department_id")
    private Department department;

    @Column(name = "employment_date")
    private LocalDate employmentDate;

    @Column(name = "active")
    private Boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="position_id")
    private Position position;

    public Employee(final EmployeeRequest employeeRequest) {
        this.name = employeeRequest.getName();
        this.surname = employeeRequest.getSurname();
        this.department = new Department(employeeRequest.getDepartmentRequest());
        this.employmentDate = employeeRequest.getEmploymentDate();
        this.active = employeeRequest.getActive();
        this.position = new Position(employeeRequest.getPositionRequest());
    }
}
