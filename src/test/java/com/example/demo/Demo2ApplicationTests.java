package com.example.demo;

import com.example.demo.entity.Category;
import com.example.demo.entity.Good;
import com.example.demo.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.util.Set;

@SpringBootTest
class Demo2ApplicationTests {
    @Autowired
    PermissionRepository permissionRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    BuyerRepository buyerRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    GoodRepository goodRepository;

    @Test
    void printPermissions () {
        permissionRepository.findAll().forEach(System.out::println);
    }

    @Test
    void printUsers () {
        userRepository.findAll().forEach(System.out::println);
    }

    @Test
    void printSellers () {
        sellerRepository.findAll().forEach(System.out::println);
    }

    @Test
    void printBuyers () {
        buyerRepository.findAll().forEach(System.out::println);
    }

    @Test
    void printCategories () {
        categoryRepository.findAll().forEach(System.out::println);
    }

    @Test
    void printGoods () {
        goodRepository.findAll().forEach(System.out::println);
    }

    @Test
    void addGpuToGoods () {
        goodRepository.save(new Good(null, "AMD RX6400", AggregateReference.to(2)));

        goodRepository.findAll().forEach(System.out::println);
    }
}
