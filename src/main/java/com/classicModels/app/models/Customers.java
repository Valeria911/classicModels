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
@Table(name = "customers")
public class Customers {

    @Id
    Long customerNumber;

    @Column
    String customerName;

    @Column
    String contactLastName;
    String contactFirstName;
    String phone;
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String postalCode;
    String country;
    Long salesRepEmployeeNumber;
    Double creditLimit;

    @ManyToOne
    @JoinColumn(name="salesRepEmployeeNumber", referencedColumnName = "employeeNumber", insertable = false, updatable = false)
    private Employees employees;

    @OneToMany(mappedBy = "customers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Orders> orders;


}
