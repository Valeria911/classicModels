package com.classicModels.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employees {

    @Id
    Long employeeNumber;

    @Column
    String lastName;

    @Column
    String firstName;
    String extension;
    String email;
    String officeCode;
    Long reportsTo;
    String jobTitle;

    @OneToMany(mappedBy = "employees", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Customers> customers;

}
