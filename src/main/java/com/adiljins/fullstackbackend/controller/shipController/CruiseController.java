package com.adiljins.fullstackbackend.controller.shipController;

import com.adiljins.fullstackbackend.exception.NotFoundException;
import com.adiljins.fullstackbackend.model.ship.Cruise;
import com.adiljins.fullstackbackend.model.ship.Ship;
import com.adiljins.fullstackbackend.repository.CruiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class CruiseController {

    @Autowired
    private CruiseRepository cruiseRepository;

    @PostMapping(path = "/cruise")
    Cruise newCruise(@RequestBody Cruise newCruise){
        int weightMin = newCruise.getWeightMin();
        int weightMax = newCruise.getWeightMax();
        int pricePerYear = newCruise.getPricePerYear();
        return cruiseRepository.save(newCruise);
    }

    @GetMapping("/cruises")
    List<Cruise> getAllCruises(){return cruiseRepository.findAll();}

    @GetMapping("/cruises/{id}")
    Cruise getCruiseById(@PathVariable Long id){
        return cruiseRepository.findById(id).orElseThrow(()->new NotFoundException(id));
    }

    @PutMapping("/cruise/{id}")
    Cruise updateCruise(@RequestBody Cruise newCruise,@PathVariable Long id){
        return cruiseRepository.findById(id).map(cruise -> {
            cruise.setName(newCruise.getName());
            cruise.setAddress(newCruise.getAddress());
            cruise.setWeightMin(newCruise.getWeightMin());
            cruise.setWeightMax(newCruise.getWeightMax());
            cruise.setPricePerYear(newCruise.getPricePerYear());
            cruise.setPrice(newCruise.getPrice());
            cruise.setYears(newCruise.getYears());
            cruise.setTypeLease(newCruise.getTypeLease());
            return cruiseRepository.save(cruise);
        }).orElseThrow(()->new NotFoundException(id));
    }

    @DeleteMapping("/cruise/{id}")
    String deleteCruise(@PathVariable Long id){
        if(!cruiseRepository.existsById(id)){
            throw new NotFoundException(id);
        }
        cruiseRepository.deleteById(id);
        return "Cruise with id " + id + " has been deleted";
    }

}

