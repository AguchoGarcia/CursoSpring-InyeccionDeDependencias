package com.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.springboot.di.app.springboot_di.models.Product;

@Primary
@RequestScope
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository{

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new Product(1L, "Arroz Amanda 1KG", 2500L),
            new Product(2L, "Fideo Marolio 500G", 800L),
            new Product(3L, "Aceite Lagrima de Sol 900ml", 1300L),
            new Product(4L, "Queso Cremoso Amasuyo 1KG", 5500L));
    }

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
