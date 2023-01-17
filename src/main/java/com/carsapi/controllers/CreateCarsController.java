package com.carsapi.controllers;

import com.carsapi.dto.Car;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars/create")
public class CreateCarsController {
    @PostMapping
    public void create(@RequestBody Car req) {
    System.out.println(req);
    }
}
