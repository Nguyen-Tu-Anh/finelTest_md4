package com.example.minitest_3.repository;

import com.example.minitest_3.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepo extends CrudRepository<City, Long> {
}
