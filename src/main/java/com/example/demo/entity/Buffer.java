package com.example.demo.entity;

import org.springframework.data.annotation.Id;

public record Buffer(@Id Integer id, short amount) {
}
