package com.example.demo.repository;

import com.example.demo.entity.Good;
import org.springframework.data.repository.ListCrudRepository;

public interface GoodRepository extends ListCrudRepository<Good, Integer> {
}
