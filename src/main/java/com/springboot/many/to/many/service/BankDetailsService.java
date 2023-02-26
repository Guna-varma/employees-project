package com.springboot.many.to.many.service;

import com.springboot.many.to.many.repository.BankDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankDetailsService {

    @Autowired
    private BankDetailsRepository repo;
}
