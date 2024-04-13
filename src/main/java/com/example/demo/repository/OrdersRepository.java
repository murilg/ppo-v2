package com.example.demo.repository;

import com.example.demo.entity.Orders;
import org.springframework.data.repository.ListCrudRepository;

public interface OrdersRepository extends ListCrudRepository <Orders, Integer> {
}
