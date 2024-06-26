package com.example.demo;

import com.example.demo.repository.BuyerRepository;
import com.example.demo.repository.PermissionRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();

        SpringApplication.run(Demo2Application.class, args);
    }

    @Bean
    ApplicationRunner demo2(PermissionRepository repository) {
        return args -> {
            repository.findAll().forEach(System.out::println);
        };
    }

//    @Bean
//    ApplicationRunner demo2(UserRepository repository) {
//        return args -> {
//            repository.findAll().forEach(System.out::println);
//        };
//    }

//    @Bean
//    ApplicationRunner demo2(BuyerRepository repository) {
//        return args -> {
//            repository.findAll().forEach(System.out::println);
//        };
//    }
}
