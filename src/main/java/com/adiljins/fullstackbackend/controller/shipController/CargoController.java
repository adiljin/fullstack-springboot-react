package com.adiljins.fullstackbackend.controller.shipController;


import com.adiljins.fullstackbackend.exception.NotFoundException;
import com.adiljins.fullstackbackend.model.ship.Cargo;
import com.adiljins.fullstackbackend.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.adiljins.fullstackbackend.accounting.Lease.getLeasing;

@RestController
@CrossOrigin("http://localhost:3000/")
public class CargoController {

    @Autowired
    private CargoRepository cargoRepository;

    @PostMapping(path = "/cargo")
    Cargo newCargo(@RequestBody Cargo newCargo){
        newCargo.setPrice(getLeasing(newCargo.getTypeLease(),newCargo.getYears(),newCargo.getPricePerYear()));
        return cargoRepository.save(newCargo);
    }

    @GetMapping("/cargos")
    List<Cargo> cargos(){return cargoRepository.findAll();}

    @GetMapping("/cargos/{id}")
    Cargo getCargoById(@PathVariable Long id){
        return cargoRepository.findById(id).orElseThrow(()->new NotFoundException(id));
    }

    @PutMapping("/cargo/{id}")
    Cargo updateCargo(@RequestBody Cargo newCargo,@PathVariable Long id){
        return cargoRepository.findById(id).map(cargo -> {
            cargo.setName(newCargo.getName());
            cargo.setAddress(newCargo.getAddress());
            cargo.setPrice(newCargo.getPrice());
            cargo.setYears(newCargo.getYears());
            cargo.setTypeLease(newCargo.getTypeLease());
            return cargoRepository.save(cargo);
        }).orElseThrow(()->new NotFoundException(id));
    }

    @DeleteMapping("/cargo/{id}")
    String deleteCargo(@PathVariable Long id){
        if(!cargoRepository.existsById(id)){
            throw new NotFoundException(id);
        }
        cargoRepository.deleteById(id);
        return "Cargo with id " + id + " has been deleted";
    }
}
