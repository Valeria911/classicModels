package com.classicModels.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "offices")
public class Offices {

    @Id
    String officeCode;

    @Column
    String city;

    @Column
    String phone;
    String addressLine1;
    String addressLine2;
    String state;
    String country;
    String postalCode;
    String territory;
}
