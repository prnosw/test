package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Countries;
import com.test.repository.CountriesRepository;

//defining the business logic  
@Service

public class CountriesService {
	@Autowired  
	CountriesRepository countriesRepository;
	
	//getting all countries record by using the method findaAll() of CrudRepository  
	public List<Countries> getAllCountries()   
	{  
	List<Countries> countries = new ArrayList<Countries>();  
	countriesRepository.findAll().forEach(countries1 -> countries.add(countries1));  
	return countries;  
	}  
	
	//getting a specific record by using the method findById() of CrudRepository  
	public Countries getCountriesById(int id)   
	{  
	return countriesRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Countries countries)   
	{  
		countriesRepository.save(countries);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		countriesRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Countries countries, int countryid)   
	{  
		countriesRepository.save(countries);  
	}  
	

}
