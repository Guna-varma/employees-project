package com.springboot.many.to.many.repository;

import com.springboot.many.to.many.entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails,Integer> {

}
