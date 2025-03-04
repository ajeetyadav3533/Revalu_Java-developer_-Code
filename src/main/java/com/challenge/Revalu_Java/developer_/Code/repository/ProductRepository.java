package com.challenge.Revalu_Java.developer_.Code.repository;

import com.challenge.Revalu_Java.developer_.Code.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByCategoriesName(String name);
    List<Product> findByTags(String tag);
}