package com.example.minitest_3.service;


import com.example.minitest_3.model.City;

import java.util.List;
import java.util.Optional;

public interface ICityService {
    List<City> findAll();

    void save (City city);

    Optional<City> findById (Long id);

    void deleteById (Long id);
}
