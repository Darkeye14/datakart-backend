package com.dbms.datakart.repo;

import com.dbms.datakart.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

  //  Customer findByCustomerEmail(String email);
}
