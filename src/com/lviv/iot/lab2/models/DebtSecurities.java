package com.lviv.iot.lab2.models;
import java.time.LocalDate;




public class DebtSecurities extends Securities{
	DebtSecuritiesType debtSecuritiesType;
	
	public DebtSecurities(double price, LocalDate dueDate, LocalDate buyDate, 
													StockTrend stockTrend, RiskLevel riskLevel,
													String companyName, DebtSecuritiesType debtSecuritiesType) {
		
		super(price,  dueDate,  buyDate,  stockTrend,  riskLevel,  companyName);
		this.debtSecuritiesType = debtSecuritiesType;
		
	}
	
	public double getDividends() { 
		return 0d;
	}
}
