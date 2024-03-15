package com.example.demo.repository;

import com.example.demo.entity.Buyer;
import org.springframework.data.repository.ListCrudRepository;

public interface BuyerRepository extends ListCrudRepository<Buyer, Integer> {
}
