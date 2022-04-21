package com.lviv.iot.lab2.models;
import java.time.LocalDate;
import java.util.Objects;




public class DebtSecurities extends Securities{
	DebtSecuritiesType debtSecuritiesType;
	
	public DebtSecurities(double price, int dueDate, int buyDate, 
													StockTrend stockTrend, RiskLevel riskLevel,
													String companyName, DebtSecuritiesType debtSecuritiesType) {
		
		super(price,  dueDate,  buyDate,  stockTrend,  riskLevel,  companyName);
		this.debtSecuritiesType = debtSecuritiesType;
		
	}
	
	public DebtSecuritiesType getDebtSecuritiesType() {
		return debtSecuritiesType;
	}

	public void setDebtSecuritiesType(DebtSecuritiesType debtSecuritiesType) {
		this.debtSecuritiesType = debtSecuritiesType;
	}

	public double getDividends() { 
		return 0d;
	}
	@Override
	public String toString() {
		return "DebtSecurities [price=" + this.getPrice() + "\t Due Date = " + this.getDueDate() + "\t Buy Date ="  + this.getBuyDate() + "\t"
				+ "Stock Trend = " + stockTrend + "Company Name = " + this.getCompanyName() + "Debt Securities Type = " + 		
	debtSecuritiesType + "Risk Level = " + riskLevel + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(debtSecuritiesType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DebtSecurities other = (DebtSecurities) obj;
		return debtSecuritiesType == other.debtSecuritiesType;
	}
	public String Represent() {
		return super.Represent() + " Debt securities Type =" + debtSecuritiesType + "]";
	}
	
}
