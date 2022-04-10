package com.example.productsservice.rest;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CreateProductRestModel {

    private String title;
    private BigDecimal price;
    private String quantity;

}
