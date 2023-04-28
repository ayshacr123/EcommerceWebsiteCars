package com.Example.EcommerceWebsiteCars.service;

import com.Example.EcommerceWebsiteCars.entity.Cars;
import com.Example.EcommerceWebsiteCars.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarsRepository repo;
    public Cars addCar(Cars cars) {
        return repo.save(cars);
    }
}
