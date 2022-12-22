package com.adiljins.fullstackbackend.model.ship.ports_3;

import com.adiljins.fullstackbackend.model.essential.Company;
import com.adiljins.fullstackbackend.model.ship.Ship;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;

@Entity
public class Cruise extends Ship {
    private final int weightMin = 50;
    private final int weightMax = 1000;
    private final int pricePerYear = 1000;

    public int getWeightMin() {
        return weightMin;
    }
    public int getWeightMax() {
        return weightMax;
    }
    public int getPricePerYear() {
        return pricePerYear;
    }



}
