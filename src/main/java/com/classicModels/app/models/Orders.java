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
@Table(name = "orders")
public class Orders {

    @Id
    Long orderNumber;

    @Column
    Date orderDate;

    @Column
    Date requiredDate;
    Date shippedDate;
    String status;
    String comments;
    Long customerNumber;

    @ManyToOne
    @JoinColumn(name="customerNumber", referencedColumnName = "customerNumber", insertable = false, updatable = false)
    private Customers customers;
}
