package com.adiljins.fullstackbackend.model.ship;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;

@MappedSuperclass
public class Ship {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    private int weightMin;
    private int weightMax;
    private int pricePerYear;
    private int price;
    private int years;
    private String typeLease;


    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getWeightMin() {
        return weightMin;
    }
    public void setWeightMin(int weightMin) {
        this.weightMin = weightMin;
    }
    public int getWeightMax() {
        return weightMax;
    }
    public void setWeightMax(int weightMax) {
        this.weightMax = weightMax;
    }
    public int getPricePerYear() {
        return pricePerYear;
    }
    public void setPricePerYear(int pricePerYear) {
        this.pricePerYear = pricePerYear;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
    public String getTypeLease() {
        return typeLease;
    }
    public void setTypeLease(String typeLease) {
        this.typeLease = typeLease;
    }
}
