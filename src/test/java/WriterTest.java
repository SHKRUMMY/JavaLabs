import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.lviv.iot.lab2.models.Securities;
import com.lviv.iot.lab2.models.Writer;

import junit.framework.Assert;

public class WriterTest extends BaseSecuritiesTest {

	
	@Test
	public void testWriteToCSV() throws IOException{
		Writer writer = new Writer();
		writer.writeToFile(testStockMarket.getAvailiableSecurities(), "src\\test\\resources\\expected.csv");

		
		Path actualPath = Paths.get("Securities.csv");
		Path expectedPath = Paths.get("expected.csv");
		
		List<String> actualString = Files.readAllLines(actualPath);
		List<String> expectedList = Files.readAllLines(expectedPath);
		
		Assert.assertEquals(actualPath, expectedPath);
	}	
	
	public void testFileNotNull() throws IOException {
	try (BufferedReader abr = new BufferedReader(new FileReader("Securities.csv"));
			BufferedReader ebr = new BufferedReader(new FileReader("expected.csv"));
	
			) {
	    String aline = abr.readLine();
	    String eline = ebr.readLine();
	    if (aline == null || eline == null) {
	    	if(aline.length() == 0 && eline.length() == 0) {
	    	}
	    	System.out.println("File is empty");	 
	    			
	    }
	    	 
		}	        
	}
}
