import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import com.lviv.iot.lab2.Manager.SecuritiesManager;
import com.lviv.iot.lab2.models.DebtSecurities;
import com.lviv.iot.lab2.models.DebtSecuritiesType;
import com.lviv.iot.lab2.models.EquitySecurities;
import com.lviv.iot.lab2.models.EquitySecuritiesType;
import com.lviv.iot.lab2.models.RiskLevel;
import com.lviv.iot.lab2.models.Securities;
import com.lviv.iot.lab2.models.StockMarket;
import com.lviv.iot.lab2.models.StockTrend;

public class BaseSecuritiesTest {
	protected StockMarket testStockMarket = new StockMarket();
	protected SecuritiesManager securitiesManager = new SecuritiesManager();
	
	@BeforeEach
	public void createSecurities(){
		
		testStockMarket.addSecurities(new DebtSecurities(10d, 2022, 2023, StockTrend.INCREASING, RiskLevel.HIGH, "Tesla", DebtSecuritiesType.BILLS));
		testStockMarket.addSecurities(new DebtSecurities(5d, 2022, 2023, StockTrend.DECREASING, RiskLevel.VERYHIGH, "Apple", DebtSecuritiesType.OBLIGATIONS));
		testStockMarket.addSecurities(new EquitySecurities(100d, 2022, 2023, StockTrend.INCREASING, RiskLevel.LOW, "Samsung", EquitySecuritiesType.SERTIFICATES));
		testStockMarket.addSecurities(new EquitySecurities(50d, 2022, 2023, StockTrend.DECREASING, RiskLevel.MEDIUM, "Mercedes", EquitySecuritiesType.SHARES));
		
}

}
