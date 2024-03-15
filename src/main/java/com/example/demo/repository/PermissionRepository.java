package com.example.demo.repository;

import com.example.demo.entity.Permission;
import org.springframework.data.repository.ListCrudRepository;

public interface PermissionRepository extends ListCrudRepository<Permission, Integer> {
}
