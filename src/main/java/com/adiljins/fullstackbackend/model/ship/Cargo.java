package com.adiljins.fullstackbackend.model.ship;
import static com.adiljins.fullstackbackend.accounting.Lease.getLeasing;
import jakarta.persistence.Entity;

@Entity
public class Cargo extends Ship{

    private final int weightMin = 2000;
    private final int weightMax = 5000;
    private final int pricePerYear = 2000;

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
