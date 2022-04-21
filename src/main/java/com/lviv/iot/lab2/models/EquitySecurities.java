package com.lviv.iot.lab2.models;
import java.time.LocalDate;
import java.util.Objects;

public class EquitySecurities extends Securities {
	EquitySecuritiesType equitySecuritiesType;
	public EquitySecurities(double price, int dueDate, int buyDate, StockTrend stockTrend,
			RiskLevel riskLevel, String companyName, EquitySecuritiesType equitySecuritiesType) {
		super(price, dueDate, buyDate, stockTrend, riskLevel, companyName);
		this.equitySecuritiesType = equitySecuritiesType;
	}

		
	
	public EquitySecuritiesType getEquitySecuritiesType() {
		return equitySecuritiesType;
	}



	public void setEquitySecuritiesType(EquitySecuritiesType equitySecuritiesType) {
		this.equitySecuritiesType = equitySecuritiesType;
	}



	public double getRepays() {
		return 0;
	}



	@Override
	public int hashCode() {
		return Objects.hash(equitySecuritiesType);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquitySecurities other = (EquitySecurities) obj;
		return equitySecuritiesType == other.equitySecuritiesType;
	}



	@Override
	public String toString() {
		return "EquitySecurities [price=" + this.getPrice() + "\t Due Date = " + this.getDueDate() + "\t Buy Date ="  + this.getBuyDate() + "\t"
				+ "Stock Trend = " + stockTrend + "Company Name = " + this.getCompanyName() + "Equity Securities Type = " + 		
	equitySecuritiesType + "Risk Level = " + riskLevel + "]";
	}
	
}
