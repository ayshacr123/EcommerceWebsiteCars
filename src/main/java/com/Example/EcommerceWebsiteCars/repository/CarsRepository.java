package com.Example.EcommerceWebsiteCars.repository;

import com.Example.EcommerceWebsiteCars.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarsRepository extends JpaRepository<Cars,Long> {
}
