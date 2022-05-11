package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.lviv.iot.lab2.models.DebtSecurities;
import com.lviv.iot.lab2.models.DebtSecuritiesType;
import com.lviv.iot.lab2.models.EquitySecurities;
import com.lviv.iot.lab2.models.EquitySecuritiesType;
import com.lviv.iot.lab2.models.RiskLevel;
import com.lviv.iot.lab2.models.Securities;
import com.lviv.iot.lab2.models.StockTrend;

import junit.framework.Assert;

public class SecuritiesManagerTest extends BaseSecuritiesTest {

	@Test
	public void testSortedSecuritiesByPriceAsc() {
		List<Securities> sortedSecuritiesByPriceAsc = securitiesManager.ascendingSortByPrice(testStockMarket);
		assertEquals(5d, sortedSecuritiesByPriceAsc.get(0).getPrice());
		assertEquals(10d, sortedSecuritiesByPriceAsc.get(1).getPrice());
		assertEquals(50d, sortedSecuritiesByPriceAsc.get(2).getPrice());
		assertEquals(100d, sortedSecuritiesByPriceAsc.get(3).getPrice());
	}

	@Test
	public void testSortedSecuritiesByPriceDesc() {
		List<Securities> sortedSecuritiesByPriceDesc = securitiesManager.descendingSortByPrice(testStockMarket);
		assertEquals(5d, sortedSecuritiesByPriceDesc.get(3).getPrice());
		assertEquals(10d, sortedSecuritiesByPriceDesc.get(2).getPrice());
		assertEquals(50d, sortedSecuritiesByPriceDesc.get(1).getPrice());
		assertEquals(100d, sortedSecuritiesByPriceDesc.get(0).getPrice());
	}

	@Test
	public void testSortedSecuritiesByCompanyNameAsc() {
		List<Securities> sortedSecuritiesByCompanyNameAsc = securitiesManager.ascendingSortByCompanyName(testStockMarket);
		List<String>expectedData = null;
		for(int securities = 0; securities< testStockMarket.getAvailiableSecurities().size(); securities++) {
			expectedData.add(testStockMarket.getAvailiableSecurities().get(securities).getCompanyName());
			
		}
		assertEquals(sortedSecuritiesByCompanyNameAsc, expectedData);
	}

	@Test
	public void testSortedSecuritiesByCompanyNameDesc() {
		List<Securities> sortedSecuritiesByCompanyNameDesc = securitiesManager.descendingSortByCompanyName(testStockMarket);
		assertEquals("Apple", sortedSecuritiesByCompanyNameDesc.get(3).getCompanyName());
		assertEquals("Mercedes", sortedSecuritiesByCompanyNameDesc.get(2).getCompanyName());
		assertEquals("Samsung", sortedSecuritiesByCompanyNameDesc.get(1).getCompanyName());
		assertEquals("Tesla", sortedSecuritiesByCompanyNameDesc.get(0).getCompanyName());
	}

	@Test
	public void testEquals() { // Symmetrical equals and hashcode testing

		Securities debt1 = new DebtSecurities(10d, 2022, 2023, StockTrend.INCREASING, RiskLevel.HIGH, "Tesla",
				DebtSecuritiesType.BILLS);
		Securities debt2 = new DebtSecurities(10d, 2022, 2023, StockTrend.INCREASING, RiskLevel.HIGH, "Tesla",
				DebtSecuritiesType.BILLS);
		Securities equity1 = new EquitySecurities(50d, 2022, 2023, StockTrend.DECREASING, RiskLevel.MEDIUM, "Mercedes",
				EquitySecuritiesType.SHARES);
		Securities equity2 = new EquitySecurities(50d, 2022, 2023, StockTrend.DECREASING, RiskLevel.MEDIUM, "Mercedes",
				EquitySecuritiesType.SHARES);
		Assert.assertTrue(debt1.equals(debt2) && debt2.equals(debt1));
		Assert.assertTrue(debt1.hashCode() == debt2.hashCode());

		Assert.assertTrue(equity1.equals(equity2) && equity2.equals(equity1));
		Assert.assertTrue(equity1.hashCode() == equity2.hashCode());
	}

	@Test
	public void testStockMarketAvailiableSecuritiesNotNull() {
		Assert.assertNotNull(testStockMarket.getAvailiableSecurities());
	}

	@Test
	public void testConstructorAndRepresent() {
		String expectedForDebt = "[Price =10.0, Due Date =2022,Buy Date =2023, Stocke Trend =INCREASING, Risk Level = HIGH , Company Name =Tesla Debt securities Type =BILLS]";
		String expectedForEquity = "[Price =100.0, Due Date =2022,Buy Date =2023, Stocke Trend =INCREASING, Risk Level = LOW , Company Name =Samsung Equity securities Type =SERTIFICATES]";
		Assert.assertEquals(expectedForDebt, testStockMarket.getAvailiableSecurities().get(0).Represent());
		Assert.assertEquals(expectedForEquity, testStockMarket.getAvailiableSecurities().get(2).Represent());
	}

	@Test
	public void testToString() {
		Assert.assertEquals(true,
				testStockMarket.getAvailiableSecurities().get(0).toString().contains("Company Name = Tesla"));
	}
	

}
