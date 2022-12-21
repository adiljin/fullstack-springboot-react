package com.adiljins.fullstackbackend.model.ship;

import jakarta.persistence.*;
import static com.adiljins.fullstackbackend.accounting.Lease.getLeasing;

@MappedSuperclass
public class Ship {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private int years;
    private String typeLease;
    private int price;

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
