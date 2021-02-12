package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.test.model.Countries;
import com.test.service.CountriesService;


//mark class as controller
@RestController
public class CountriesController {
	
	//auto wire the CountriesService class
	@Autowired
	CountriesService countriesService;
	
	//creating a get mapping that retrieves all the country detail from the database 
	
	@GetMapping("/country")  
	
	private List<Countries> getAllCountries(){
		return countriesService.getAllCountries();
	}
	
	//creating a get mapping that retrieves the detail of a specific country
	@GetMapping("/country/{countryid}")  
	
	private Countries getCountries(@PathVariable("countryid")int countryid) {
		return countriesService.getCountriesById(countryid); 
		
	}
	
	//creating a delete mapping that deletes a specified country 
	@DeleteMapping("/country/{countryid}")  
	
	private void deleteCountry(@PathVariable("countryid") int countryid)   
	{  
		countriesService.delete(countryid);  
	}  
	
	//creating post mapping that post the country  detail in the database  
	@PostMapping("/countries")  
	
	private int saveCountry(@RequestBody Countries countries)   
	{  
		countriesService.saveOrUpdate(countries);  
		return countries.getCountryId();  
	}  
	
	//creating put mapping that updates the country detail   
	@PutMapping("/countries")  
	
	private Countries update(@RequestBody Countries countries)   
	{  
		countriesService.saveOrUpdate(countries);  
		return countries;  
	}  

}
