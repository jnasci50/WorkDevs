package com.Jnasci_Dev.Cities_Api.countries.repositories;

import com.Jnasci_Dev.Cities_Api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
