package com.todorkrastev.krastevsgym.repository;

import com.todorkrastev.krastevsgym.model.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
//@CrossOrigin({"http://localhost:4200", "https://todorkrastev.com"}) -> multiple
//@CrossOrigin -> wildcard (any website)
public interface StateRepository extends JpaRepository<State, Integer> {

    List<State> findByCountryCode(String code);
}
