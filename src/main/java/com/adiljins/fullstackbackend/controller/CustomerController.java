package com.adiljins.fullstackbackend.controller;

import com.adiljins.fullstackbackend.exception.NotFoundException;
import com.adiljins.fullstackbackend.model.essential.Customer;
import com.adiljins.fullstackbackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(path = "/customer")
    Customer newCustomer(@RequestBody Customer newCustomer){
        return customerRepository.save(newCustomer);
    }

    @GetMapping("/customers")
    List<Customer> getAllCustomers(){return customerRepository.findAll();}

    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable Long id){
        return customerRepository.findById(id).orElseThrow(()->new NotFoundException(id));
    }

    @PutMapping("/customer/{id}")
    Customer updateCustomer(@RequestBody Customer newCustomer,@PathVariable Long id){
        return customerRepository.findById(id).map(customer -> {
            customer.setName(newCustomer.getName());
            customer.setAddress(newCustomer.getAddress());
            customer.setNumber(newCustomer.getNumber());
            customer.setE_mail(newCustomer.getE_mail());
            return customerRepository.save(customer);
        }).orElseThrow(()->new NotFoundException(id));
    }

    @DeleteMapping("/customer/{id}")
    String deleteCustomer(@PathVariable Long id){
        if(!customerRepository.existsById(id)){
            throw new NotFoundException(id);
        }
        customerRepository.deleteById(id);
        return "Customer with id " + id + " has been deleted";
    }

}
