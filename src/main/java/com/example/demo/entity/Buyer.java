package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

public record Buyer(@Id Integer id, String surname, String name, String phoneNumber, String email, String address, AggregateReference<Users, Integer> users) {
}
