package com.challenge.Revalu_Java.developer_.Code.controller;


import com.challenge.Revalu_Java.developer_.Code.model.Product;
import com.challenge.Revalu_Java.developer_.Code.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/show_all")
    public ResponseEntity<List<Product>> showAll() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/categories/{cat_name}")
    public ResponseEntity<List<Product>> searchByCategoryName(@PathVariable String cat_name) {
        return ResponseEntity.ok(productService.getProductsByCategoryName(cat_name));
    }

    @GetMapping("/tags/{tagname}")
    public ResponseEntity<List<Product>> searchByTagName(@PathVariable String tagname) {
        return ResponseEntity.ok(productService.getProductsByTag(tagname));
    }
}