package com.lviv.iot.lab2.models;
import java.time.LocalDate;

public class EquitySecurities extends Securities {
	EquitySecuritiesType equitySecuritiesType;
	public EquitySecurities(double price, LocalDate dueDate, LocalDate buyDate, StockTrend stockTrend,
			RiskLevel riskLevel, String companyName, EquitySecuritiesType equitySecuritiesType) {
		super(price, dueDate, buyDate, stockTrend, riskLevel, companyName);
		this.equitySecuritiesType = equitySecuritiesType;
	}

		
	
	public double getRepays() {
		return 0;
	}
}
