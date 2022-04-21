package com.lviv.iot.lab2.models;
import java.util.ArrayList;
import java.util.List;


public class StockMarket {
	private String location;
	private ArrayList<Securities> availiableSecurities = new ArrayList<>();
	
	public List<Securities> addSecurities(Securities s) {
		availiableSecurities.add(s);
		return availiableSecurities;
	}
	
	
	public String getLocation() {
		return location;
	}



	
	
	
public void showPrice() {
		
	}

public List<Securities> getAvailiableSecurities() {
	return availiableSecurities;
}


}
