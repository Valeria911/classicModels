package com.classicModels.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payments {

    @Id
    Long customerNumber;

    @Id
    String checkNumber;

    @Column
    Date paymentDate;

    @Column
    Double amount;

    @ManyToOne
    @JoinColumn(name="customerNumber", referencedColumnName = "customerNumber", insertable = false, updatable = false)
    private Customers customers;
}
