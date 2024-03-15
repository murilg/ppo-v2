package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

public record Users(@Id Integer id, String login, String password, AggregateReference<Permission, Integer> permission, Buyer buyer) {
}
