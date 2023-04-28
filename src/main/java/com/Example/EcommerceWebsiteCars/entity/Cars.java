package com.Example.EcommerceWebsiteCars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars {
    @Id
    @GeneratedValue
    private Long carId;
    private String carName;
    private String mfd;
    @ElementCollection
    private List<String> colors;
    private String model;
    @ElementCollection
    private List<String> accessories;
    private String price;
    @ElementCollection
    private List<String> paymentType;
    @ElementCollection
    private List<String> cities;
}
