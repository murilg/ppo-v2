package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import java.util.Set;

public record Category (@Id Integer id, String name, Set<Good> goods) {
}
