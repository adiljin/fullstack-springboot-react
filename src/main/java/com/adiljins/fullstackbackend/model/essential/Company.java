package com.adiljins.fullstackbackend.model.essential;

import com.adiljins.fullstackbackend.model.ship.Ship;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String number;
    private String e_mail;

    @ManyToMany
    Set<Ship> ships;
    public Set<Ship> getShips() {
        return ships;
    }
    public void setShips(Set<Ship> ships) {
        this.ships = ships;
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
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getE_mail() {
        return e_mail;
    }
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
