package com.adiljins.fullstackbackend.model.routes_management;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Routes {
    public static String routeType(int routeType, int ports) {
        String result = null;
        if(routeType == 1) {
            result = "Whole route - " + ports;
        }
        else if(routeType == 2) {
            result = "Custom route - " + ports;
        }
        return result;
    }

    public static int priceGenerator(int port1, int port2) {
        boolean may = false;
        int counterPrice = 0;
        int result = 0;
        int invite = 0;

        ArrayList<Route> ListBack = null;
        try {
            FileInputStream fileIn = new FileInputStream("dataRoutes");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ListBack = (ArrayList<Route>) in.readObject();
            in.close();
            fileIn.close();
        }catch (Exception e) {
            invite++;
            System.out.println("System did not have any data");
        }
        if(invite==0) {
            for (Route x : ListBack) {
                if(x.getPortNumber() == port1) {
                    may = true;
                }
                if(may) {
                    counterPrice = counterPrice + x.getPriceFrom();
                }
                if(x.getPortNumber() == port2) {
                    break;
                }
            }
            if (ListBack.size() == 0) {
                System.out.println("System does not have any routes");
            }
        }
        result = counterPrice;
        return result;
    }
}
