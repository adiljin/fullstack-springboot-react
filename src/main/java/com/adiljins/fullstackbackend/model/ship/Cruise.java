package com.adiljins.fullstackbackend.model.ship;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Table;
import org.springframework.context.annotation.Bean;


@Entity
public class Cruise extends Ship{
//    private Long id;
//    private String name;
//    private String address;
//    private int price;
//    private int years;
//    private String typeLease;

    private int weightMin = 50;
    private int weightMax = 1000;
    private int pricePerYear = 1000;



//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String getAddress() {
//        return address;
//    }
//
//    @Override
//    public int getPrice() {
//        return price;
//    }
//
//    @Override
//    public int getYears() {
//        return years;
//    }
//
//    @Override
//    public String getTypeLease() {
//        return typeLease;
//    }

    @Override
    public int getWeightMin() {
        return weightMin;
    }

    @Override
    public int getWeightMax() {
        return weightMax;
    }

    @Override
    public int getPricePerYear() {
        return pricePerYear;
    }
}
