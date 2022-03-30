package com.zensar;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessAppTest {

	@Test
	public void testBusinessApp() {
		CityService cityService=new CityServiceImpl();//New CityService Iml
		BusinessApp businessApp=new BusinessApp(cityService);
		assertEquals(BusinessApp.retrieveCityListByCountry("INDIA").size(),3);
		
	}

}
