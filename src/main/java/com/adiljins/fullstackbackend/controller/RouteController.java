package com.adiljins.fullstackbackend.controller;

import com.adiljins.fullstackbackend.exception.NotFoundException;
import com.adiljins.fullstackbackend.model.essential.Customer;
import com.adiljins.fullstackbackend.model.routes_management.Route;
import com.adiljins.fullstackbackend.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;

    @PostMapping(path = "/route")
    Route newRoute(@RequestBody Route newRoute){
        return routeRepository.save(newRoute);
    }

    @GetMapping("/routes")
    List<Route> getAllRoutes(){return routeRepository.findAll();}

    @GetMapping("/route/{id}")
    Route getRouteById(@PathVariable Long id){
        return routeRepository.findById(id).orElseThrow(()->new NotFoundException(id));
    }

    @PutMapping("/route/{id}")
    Route updateRoute(@RequestBody Route newRoute,@PathVariable Long id){
        return routeRepository.findById(id).map(route -> {
            route.setPortNumber(newRoute.getPortNumber());
            route.setPortName(newRoute.getPortName());
            route.setPriceFrom(newRoute.getPriceFrom());
            return routeRepository.save(route);
        }).orElseThrow(()->new NotFoundException(id));
    }

    @DeleteMapping("/route/{id}")
    String deleteRoute(@PathVariable Long id){
        if(!routeRepository.existsById(id)){
            throw new NotFoundException(id);
        }
        routeRepository.deleteById(id);
        return "Route with id " + id + " has been deleted";
    }

}
