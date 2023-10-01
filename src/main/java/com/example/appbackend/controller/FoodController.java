package com.example.appbackend.controller;

import com.example.appbackend.entities.Food;
import com.example.appbackend.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class FoodController {
    @Autowired

    private FoodRepository repository;

    @GetMapping
    public List<Food> getAll(){

        List<Food> foodList = repository.findAll();
        return foodList;
    }
}
