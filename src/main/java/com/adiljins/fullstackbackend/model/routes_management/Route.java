package com.adiljins.fullstackbackend.model.routes_management;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ROUTE_TBL")
public class Route {
    @Id
    @GeneratedValue
    private Long id;
    private int portNumber;
    private String portName;
    private int portPrice;
//    private int port1, port2, quantity;



//    public Route(int portNumber, String portName, int portPrice) {
//        this.portNumber = portNumber;
//        this.portName = portName;
//        this.portPrice = portPrice;
//    }
//
//    public Route(int port1, int port2, int quantity) {
//        this.port1 = port1;
//        this.port2 = port2;
//        this.quantity = quantity;
//    }

//    public int getPort1() {
//        return port1;
//    }
//    public int getPort2() {
//        return port2;
//    }
//    public int getQuantity() {
//        return quantity;
//    }

    public int getPortNumber() {
        return portNumber;
    }
    public String getPortName() {
        return portName;
    }
    public int getPriceFrom() {
        return portPrice;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }
    public void setPortName(String portName) {
        this.portName = portName;
    }
    public void setPriceFrom(int portPrice) {
        this.portPrice = portPrice;
    }
}
