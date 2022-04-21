import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.lviv.iot.lab2.Main;
import com.lviv.iot.lab2.models.DebtSecurities;
import com.lviv.iot.lab2.models.DebtSecuritiesType;
import com.lviv.iot.lab2.models.RiskLevel;
import com.lviv.iot.lab2.models.Securities;
import com.lviv.iot.lab2.models.StockTrend;

import junit.framework.Assert;

public class SecuritiesManagerTest extends BaseSecuritiesTest {
	
	@Test
	public void testAscendingSortByPrice() {
		List<Securities> result = securitiesManager.ascendingSortByPrice(testStockMarket);
		assertEquals(  5d, result.get(0).getPrice());
		assertEquals( 10d, result.get(1).getPrice());
		assertEquals( 50d, result.get(2).getPrice());
		assertEquals(100d, result.get(3).getPrice());
	}
	
	@Test
	public void testDescendingSortByPrice() {
		List<Securities> result = securitiesManager.descendingSortByPrice(testStockMarket);
		assertEquals(  5d, result.get(3).getPrice());
		assertEquals( 10d, result.get(2).getPrice());
		assertEquals( 50d, result.get(1).getPrice());
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
	public void testEquals() {
		Securities debt1 = new DebtSecurities(10d, 2022, 2023, StockTrend.INCREASING, RiskLevel.HIGH, "Tesla", DebtSecuritiesType.BILLS);
		Securities debt2 = new DebtSecurities(10d, 2022, 2023, StockTrend.INCREASING, RiskLevel.HIGH, "Tesla", DebtSecuritiesType.BILLS);
		Assert.assertTrue(debt1.equals(debt2) && debt2.equals(debt1));
		Assert.assertTrue(debt1.hashCode() == debt2.hashCode());
	}
	
	@Test
	public void testStockMarketAvailiableSecuritiesNotNull() {
		Assert.assertNotNull(testStockMarket.getAvailiableSecurities());
	}
	
	@Test
	public void testConstructor() {
		Assert.assertEquals(10d, testStockMarket.getAvailiableSecurities().get(0).getPrice());
		Assert.assertEquals(5d, testStockMarket.getAvailiableSecurities().get(1).getPrice());
		Assert.assertEquals(100d, testStockMarket.getAvailiableSecurities().get(2).getPrice());
		Assert.assertEquals(50d, testStockMarket.getAvailiableSecurities().get(3).getPrice());
		
		Assert.assertEquals(2022, testStockMarket.getAvailiableSecurities().get(0).getDueDate());
		Assert.assertEquals(2022, testStockMarket.getAvailiableSecurities().get(1).getDueDate());
		Assert.assertEquals(2022, testStockMarket.getAvailiableSecurities().get(2).getDueDate());
		Assert.assertEquals(2022, testStockMarket.getAvailiableSecurities().get(3).getDueDate());
		
		Assert.assertEquals(2023, testStockMarket.getAvailiableSecurities().get(0).getBuyDate());
		Assert.assertEquals(2023, testStockMarket.getAvailiableSecurities().get(1).getBuyDate());
		Assert.assertEquals(2023, testStockMarket.getAvailiableSecurities().get(2).getBuyDate());
		Assert.assertEquals(2023, testStockMarket.getAvailiableSecurities().get(3).getBuyDate());
		
		Assert.assertEquals(StockTrend.INCREASING, testStockMarket.getAvailiableSecurities().get(0).getStockTrend());
		Assert.assertEquals(StockTrend.DECREASING, testStockMarket.getAvailiableSecurities().get(1).getStockTrend());
		Assert.assertEquals(StockTrend.INCREASING, testStockMarket.getAvailiableSecurities().get(2).getStockTrend());
		Assert.assertEquals(StockTrend.DECREASING, testStockMarket.getAvailiableSecurities().get(3).getStockTrend());
		
		Assert.assertEquals(RiskLevel.HIGH, testStockMarket.getAvailiableSecurities().get(0).getRiskLevel());
		Assert.assertEquals(RiskLevel.VERYHIGH, testStockMarket.getAvailiableSecurities().get(1).getRiskLevel());
		Assert.assertEquals(RiskLevel.LOW, testStockMarket.getAvailiableSecurities().get(2).getRiskLevel());
		Assert.assertEquals(RiskLevel.MEDIUM, testStockMarket.getAvailiableSecurities().get(3).getRiskLevel());
		
		Assert.assertEquals("Tesla", testStockMarket.getAvailiableSecurities().get(0).getCompanyName());
		Assert.assertEquals("Apple", testStockMarket.getAvailiableSecurities().get(1).getCompanyName());
		Assert.assertEquals("Samsung", testStockMarket.getAvailiableSecurities().get(2).getCompanyName());
		Assert.assertEquals("Mercedes", testStockMarket.getAvailiableSecurities().get(3).getCompanyName());
		
	}
	
	@Test
	public void testToString() {
		String expectedString = " Securities [price=10.0, dueDate=2022, buyDate=2023, stockTrend=INCREASING, riskLevel=HIGH, companyName=Tesla]";
		Assert.assertEquals(expectedString, testStockMarket.getAvailiableSecurities().get(0).toString());
	}
}













