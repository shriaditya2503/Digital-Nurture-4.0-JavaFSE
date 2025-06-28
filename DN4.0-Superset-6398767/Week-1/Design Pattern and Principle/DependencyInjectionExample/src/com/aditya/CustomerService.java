package com.aditya;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void showCustomerDetails(int customerId) {
        String customer = customerRepository.findCustomerById(customerId);
        System.out.println("Customer: " + customer);
    }
}
