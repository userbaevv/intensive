package kz.dara.intensive.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "sur_name")
    private String surName;
    @Column(name = "email_id")
    private String emailId;
}
