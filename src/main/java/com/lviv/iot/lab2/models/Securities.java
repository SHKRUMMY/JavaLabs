package com.lviv.iot.lab2.models;
import java.time.LocalDate;

public abstract class Securities {
	private Double price;
	private int dueDate;
	private int buyDate;
	StockTrend stockTrend;
	RiskLevel riskLevel;
	private String companyName;
	
	protected Securities(double price, int dueDate, int buyDate,
					StockTrend stockTrend, RiskLevel riskLevel, String companyName) {
		this.price = price;
		this.dueDate = dueDate;
		this.buyDate = buyDate;
		this.stockTrend = stockTrend;
		this.riskLevel = riskLevel;
		this.companyName = companyName;
		}
	

	public Double getPrice() {
		return price;
	}


	public int getDueDate() {
		return dueDate;
	}


	public int getBuyDate() {
		return buyDate;
	}


	public StockTrend getStockTrend() {
		return stockTrend;
	}


	public RiskLevel getRiskLevel() {
		return riskLevel;
	}


	public String getCompanyName() {
		return companyName;
	}
	
	


	public void setStockTrend(StockTrend stockTrend) {
		this.stockTrend = stockTrend;
	}


	public void setRiskLevel(RiskLevel riskLevel) {
		this.riskLevel = riskLevel;
	}


	public double sellSecurities() {
		return 0d;
		
	}
	
	public double buySecurities() {
		return 0d;
		
	}

	
	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Securities [price=" + price + ", dueDate=" + dueDate + ", buyDate=" + buyDate + ", stockTrend="
				+ stockTrend + ", riskLevel=" + riskLevel + ", companyName=" + companyName + "]";
	}
	
	
}