package com.graphql.demo.entity;

import com.graphql.demo.controller.impl.request.PositionRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "description", length = 50)
    private String description;

    @Column(name = "base_salary")
    private Float baseSalary;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    private List<Employee> employees;

    public Position(final PositionRequest positionRequest) {
        this.id = positionRequest.getId();
    }
}
