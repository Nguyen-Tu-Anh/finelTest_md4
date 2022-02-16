package com.example.minitest_3.service;


import com.example.minitest_3.model.Country;
import com.example.minitest_3.repository.ICountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryService{
    @Autowired
    ICountryRepo countryRepo;

    @Override
    public List<Country> findAll() {
        return (List<Country>) countryRepo.findAll();
    }
}
