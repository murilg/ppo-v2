package com.example.demo.entity;

import org.springframework.data.annotation.Id;

public record Seller (@Id Integer id, String surname, String name, String patronymic, String phoneNumber, String email, String post) {
}
