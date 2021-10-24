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
@Table(name = "products")
public class Products {

    @Id
    String productCode;

    @Column
    String productName;

    @Column
    String productLine;
    String productScale;
    String productVendor;
    String productDescription;
    Integer quantityInStock;
    Double buyPrice;
    Double msrp;
}
