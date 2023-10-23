package com.todorkrastev.krastevsgym.repository;

import com.todorkrastev.krastevsgym.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
