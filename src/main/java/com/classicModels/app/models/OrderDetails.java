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
@Table(name = "orderdetails")
public class OrderDetails {

    @Id
    Long orderNumber;

    @Column
    String productCode;

    @Column
    Integer quantityOrdered;
    Double priceEach;
    Integer orderLineNumber;

}
