package com.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.model.Countries;

//repository that extends CrudRepository  
public interface CountriesRepository extends CrudRepository<Countries,Integer> {

}
