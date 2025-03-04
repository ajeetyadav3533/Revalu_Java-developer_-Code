package com.challenge.Revalu_Java.developer_.Code.config;


import com.challenge.Revalu_Java.developer_.Code.model.Category;
import com.challenge.Revalu_Java.developer_.Code.model.Product;
import com.challenge.Revalu_Java.developer_.Code.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initializeData(ProductRepository productRepository) {
        return args -> {
            if (productRepository.count() == 0) {
                Product product1 = new Product();
                product1.setId("646e39bfb0768053aa35e7a1");
                product1.setUuid("0d835b0d-4d4e-46cc-88e1-5169f638f6dc");
                product1.setName("Paint");
                product1.setCategories(Arrays.asList(
                        new Category(1, "Coverings"),
                        new Category(3, "End product")
                ));
                product1.setTags(Arrays.asList("new-product"));

                Product product2 = new Product();
                product2.setId("636e39bfb0768053aa35e7a2");
                product2.setUuid("57f318aa-75ee-4b4b-a7c0-e17400b91897");
                product2.setName("Mortar");
                product2.setCategories(Arrays.asList(
                        new Category(2, "Building products"),
                        new Category(3, "End product")
                ));
                product2.setTags(null);

                Product product3 = new Product();
                product3.setId("636e39bfb0768053aa35e7a4");
                product3.setUuid("75ee-4baa-0d835bb-a7c0-e174005169f7");
                product3.setName("Expanded cork");
                product3.setCategories(Arrays.asList(
                        new Category(4, "Insulation"),
                        new Category(2, "Building products")
                ));
                product3.setTags(Arrays.asList("bio-based"));

                productRepository.saveAll(Arrays.asList(product1, product2, product3));
            }
        };
    }
}