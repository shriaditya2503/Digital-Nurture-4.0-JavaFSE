package com.cognizant.loan.controller;

import com.cognizant.loan.entity.Loan;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number) {

        return new Loan(number,
                "car",
                400000,
                3258,
                18);
    }
}
