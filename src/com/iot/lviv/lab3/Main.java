package com.iot.lviv.lab2;


import com.lviv.iot.lab2.*;
import com.lviv.iot.lab2.Manager.SecuritiesManager;
import com.lviv.iot.lab2.models.DebtSecurities;
import com.lviv.iot.lab2.models.DebtSecuritiesType;
import com.lviv.iot.lab2.models.EquitySecurities;
import com.lviv.iot.lab2.models.EquitySecuritiesType;
import com.lviv.iot.lab2.models.RiskLevel;
import com.lviv.iot.lab2.models.StockMarket;
import com.lviv.iot.lab2.models.StockTrend;

public class Main {

	public static void main(String[] args) {
		
	
	DebtSecurities d1 = new DebtSecurities(10d, 2022, 2023, StockTrend.INCREASING, RiskLevel.HIGH, "Tesla", DebtSecuritiesType.BILLS);
	DebtSecurities d2 = new DebtSecurities(5d, 2022, 2023, StockTrend.DECREASING, RiskLevel.VERYHIGH, "Apple", DebtSecuritiesType.OBLIGATIONS);
	EquitySecurities e1 = new EquitySecurities(100d, 2022, 2023, StockTrend.INCREASING, RiskLevel.LOW, "Samsung", EquitySecuritiesType.SERTIFICATES);
	EquitySecurities e2 = new EquitySecurities(50d, 2022, 2023, StockTrend.DECREASING, RiskLevel.MEDIUM, "Mercedes", EquitySecuritiesType.SHARES);
	
	StockMarket stockMarket = new StockMarket();
	
	
	stockMarket.addSecurities(d1);
	stockMarket.addSecurities(d2);
	stockMarket.addSecurities(e1);
	stockMarket.addSecurities(e2);
	
	//System.out.println(stockMarket.getAvailiableSecurities());
	
	SecuritiesManager securitiesManager = new SecuritiesManager();
	
	securitiesManager.ascendingSortByPrice(stockMarket);
	securitiesManager.descendingSortByPrice(stockMarket);
	securitiesManager.ascendingSortByCompanyName(stockMarket);
	securitiesManager.descendingSortByCompanyName(stockMarket);
	
	
	
	
	
}
}
