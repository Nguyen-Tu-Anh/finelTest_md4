package com.example.minitest_3.repository;


import com.example.minitest_3.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepo extends CrudRepository<Country, Long> {
}
