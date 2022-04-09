package com.lviv.iot.lab2.Manager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.lviv.iot.lab2.models.Securities;
import com.lviv.iot.lab2.models.StockMarket;

public class SecuritiesManager{
	ArrayList<Securities> securitiesList;
	
	public List<Securities> ascendingSortByPrice(StockMarket sm){
		List<Securities> ascendingsortedByPrice = sm.getAvailiableSecurities().stream()
				.sorted((o1,o2)-> o1.getPrice().compareTo(o2.getPrice()))
				.collect(Collectors.toList());
	
		System.out.println("\nAscending Sort By Price");
		ascendingsortedByPrice.forEach(System.out::println);
		return ascendingsortedByPrice;
	}
	
		
	public List<Securities> descendingSortByPrice(StockMarket sm){
		List<Securities> ascendingsortedByPrice = sm.getAvailiableSecurities().stream()
				.sorted((o1,o2)-> o2.getPrice().compareTo(o1.getPrice()))
				.collect(Collectors.toList());
		
		System.out.println("\nDescending Sort By Price");
		ascendingsortedByPrice.forEach(System.out::println);
		return ascendingsortedByPrice;
	}
	
	
	
	public List<Securities> ascendingSortByCompanyName(StockMarket sm){
		List<Securities> ascendingSortedByCompanyName = sm.getAvailiableSecurities().stream()
				.sorted( (o1,o2) -> o1.getCompanyName().compareTo( o2.getCompanyName() ) )
				.collect(Collectors.toList());
		
		System.out.println("\nAscending Sort By Company Name");
		ascendingSortedByCompanyName.forEach(System.out::println);
		return ascendingSortedByCompanyName;
	}
	
	
	
	public List<Securities> descendingSortByCompanyName(StockMarket sm){
		List<Securities> descendingSortedByCompanyName = sm.getAvailiableSecurities().stream()
					.sorted( (o1,o2) -> o2.getCompanyName().compareTo( o1.getCompanyName() ) )
					.collect(Collectors.toList());
		
		System.out.println("\nDescending Sort By Company Name");
		descendingSortedByCompanyName.forEach(System.out::println);
		return descendingSortedByCompanyName;
		
	}
	
	
	
	
	
	
	
	
	
	
}

