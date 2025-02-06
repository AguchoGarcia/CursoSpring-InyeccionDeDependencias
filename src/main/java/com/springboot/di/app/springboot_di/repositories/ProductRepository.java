package com.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.springboot.di.app.springboot_di.models.Product;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Arroz Amanda 1KG", 2500L),
            new Product(2L, "Fideo Marolio 500G", 800L),
            new Product(3L, "Aceite Lagrima de Sol 900ml", 1300L),
            new Product(4L, "Queso Cremoso Amasuyo 1KG", 5500L));
    }

    public List<Product> findAll() {
        return data;
    }
}
