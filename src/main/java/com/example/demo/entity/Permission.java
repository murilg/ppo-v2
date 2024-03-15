package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

public record Permission(@Id Integer id, String role) {
}
