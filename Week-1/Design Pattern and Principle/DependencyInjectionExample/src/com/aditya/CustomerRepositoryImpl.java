package com.aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    List<Customer> customerList = Arrays.asList(
            new Customer(1,"Aditya"),
            new Customer(2,"Anubhav"),
            new Customer(3,"Ashish"));

    @Override
    public String findCustomerById(int id) {
        for(Customer customer : customerList) {
            if(customer.getId() == id) return customer.getName();
        }
        return "Customer Not Found";
    }
}
