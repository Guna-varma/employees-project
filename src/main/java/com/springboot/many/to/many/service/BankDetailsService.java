package com.springboot.many.to.many.service;

import com.springboot.many.to.many.entity.BankDetails;
import com.springboot.many.to.many.repository.BankDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankDetailsService {

    @Autowired
    private BankDetailsRepository repo;

    public BankDetails addBankDetails(BankDetails bankDetails) {
        return repo.save(bankDetails);
    }

    public List<BankDetails> getAllBankDetails() {
        return repo.findAll();
    }

    public Optional<BankDetails> getBankById(Integer id) {
        return repo.findById(id);
    }

    public Boolean deleteBank(Integer id) {
        repo.deleteById(id);
        return true;
    }
}
