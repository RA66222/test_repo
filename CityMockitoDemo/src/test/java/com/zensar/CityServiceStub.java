package com.zensar;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public abstract class CityServiceStub implements CityService{
	
	@Override
	public List<String> findCitiesBYCountries(String country){
		List<String> cities=new ArrayList<String>();
		if(country.equalsIgnoreCase("INDIA")) {
			cities=Array.asList("Pune", "Mumbai", "Delhi");
		}
		else if(country.equalsIgnoreCase("USA")) {
			cities=Array.asList("New York", "Washington");
		}
		return cities;
		
		}
	}
	
