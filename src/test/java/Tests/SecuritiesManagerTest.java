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
	public void testAscendingSortByPrice() {
		List<Securities> result = securitiesManager.ascendingSortByPrice(testStockMarket);
		assertEquals(5d, result.get(0).getPrice());
		assertEquals(10d, result.get(1).getPrice());
		assertEquals(50d, result.get(2).getPrice());
		assertEquals(100d, result.get(3).getPrice());
	}

	@Test
	public void testDescendingSortByPrice() {
		List<Securities> result = securitiesManager.descendingSortByPrice(testStockMarket);
		assertEquals(5d, result.get(3).getPrice());
		assertEquals(10d, result.get(2).getPrice());
		assertEquals(50d, result.get(1).getPrice());
		assertEquals(100d, result.get(0).getPrice());
	}

	@Test
	public void testAscendingSortByCompanyName() {
		List<Securities> result = securitiesManager.ascendingSortByCompanyName(testStockMarket);
		assertEquals("Apple", result.get(0).getCompanyName());
		assertEquals("Mercedes", result.get(1).getCompanyName());
		assertEquals("Samsung", result.get(2).getCompanyName());
		assertEquals("Tesla", result.get(3).getCompanyName());
	}

	@Test
	public void testDescendingSortByCompanyName() {
		List<Securities> result = securitiesManager.descendingSortByCompanyName(testStockMarket);
		assertEquals("Apple", result.get(3).getCompanyName());
		assertEquals("Mercedes", result.get(2).getCompanyName());
		assertEquals("Samsung", result.get(1).getCompanyName());
		assertEquals("Tesla", result.get(0).getCompanyName());
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
