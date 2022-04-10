package com.example.productsservice.core.data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class ProductEntity implements Serializable {

    /**
    *
    */
    private static final long serialVersionUID = -227264951080660124L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true)
    private String productId;

    @Column(unique = false)
    private String title;
    private BigDecimal price;
    private Integer quantity;

}