package com.adiljins.fullstackbackend.model.ship;

import com.adiljins.fullstackbackend.exception.NotFoundException;
import com.adiljins.fullstackbackend.model.essential.Company;
import com.adiljins.fullstackbackend.repository.CompanyRepository;
import com.adiljins.fullstackbackend.repository.ship_repo.CargoRepository;
import jakarta.persistence.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

import static com.adiljins.fullstackbackend.accounting.Lease.getLeasing;

//@MappedSuperclass
@Entity
public class Ship {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private int years;
    private String typeLease;
    private int price;

    @ManyToMany
    Set<Company> company;
    public Set<Company> getCompany() {
        return company;
    }
    public void setCompany(Set<Company> company) {
        this.company = company;
    }

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
