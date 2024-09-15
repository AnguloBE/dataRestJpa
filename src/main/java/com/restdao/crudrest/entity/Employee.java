package com.restdao.crudrest.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    // define fields

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    //define constructors
    public Employee() {

    }

}
