package com.example.demo.repository;

import com.example.demo.entity.Seller;
import org.springframework.data.repository.ListCrudRepository;

public interface SellerRepository extends ListCrudRepository<Seller, Integer> {
}
