package com.todorkrastev.krastevsgym.repository;

import com.todorkrastev.krastevsgym.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200")
//@CrossOrigin({"http://localhost:4200", "https://todorkrastev.com"}) -> multiple
//@CrossOrigin -> wildcard (any website)
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(Long id, Pageable pageable);
}
