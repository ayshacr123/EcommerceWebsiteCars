package com.Example.EcommerceWebsiteCars.controller;

import com.Example.EcommerceWebsiteCars.entity.Cars;
import com.Example.EcommerceWebsiteCars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping("/")

    public Cars addCar(@RequestBody Cars cars)
    {
        return service.addCar(cars);
    }

}

