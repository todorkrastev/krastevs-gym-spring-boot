package com.todorkrastev.krastevsgym.repository;

import com.todorkrastev.krastevsgym.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
//@CrossOrigin({"http://localhost:4200", "https://todorkrastev.com"}) -> multiple
//@CrossOrigin -> wildcard (any website)
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
