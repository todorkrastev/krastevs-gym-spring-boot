package com.todorkrastev.krastevsgym.repository;

import com.todorkrastev.krastevsgym.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
