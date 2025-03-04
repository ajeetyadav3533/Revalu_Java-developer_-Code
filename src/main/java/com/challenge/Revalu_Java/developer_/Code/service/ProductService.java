package com.challenge.Revalu_Java.developer_.Code.service;

import com.challenge.Revalu_Java.developer_.Code.model.Product;
import com.challenge.Revalu_Java.developer_.Code.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategoryName(String name) {
        return productRepository.findByCategoriesName(name);
    }

    public List<Product> getProductsByTag(String tag) {
        return productRepository.findByTags(tag);
    }
}