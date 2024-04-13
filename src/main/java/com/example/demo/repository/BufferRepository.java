package com.example.demo.repository;

import com.example.demo.entity.Buffer;
import org.springframework.data.repository.ListCrudRepository;

public interface BufferRepository extends ListCrudRepository<Buffer, Integer> {
}
