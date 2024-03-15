package com.example.demo.repository;

import com.example.demo.entity.Users;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<Users, Integer> {
}
