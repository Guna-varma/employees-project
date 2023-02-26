package com.springboot.many.to.many.controller;

import com.springboot.many.to.many.entity.BankDetails;
import com.springboot.many.to.many.entity.Employees;
import com.springboot.many.to.many.service.BankDetailsService;
import com.springboot.many.to.many.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bank")
public class BankDetailsController {

    @Autowired
    private BankDetailsService service;

    @PostMapping("/add")
    private BankDetails addBankDetails(@RequestBody BankDetails bankDetails){
        return service.addBankDetails(bankDetails);
    }

    @GetMapping("/getAll")
    private List<BankDetails> getAllBankDetails(){
        return service.getAllBankDetails();
    }

    @GetMapping("/get/{id}")
    private Optional<BankDetails> getBankDetailsById(@PathVariable Integer id){
        return service.getBankById(id);
    }

    @DeleteMapping("/delete/{id}")
    private Boolean deleteBankDetails(@PathVariable Integer id){
        return service.deleteBank(id);
    }
}
