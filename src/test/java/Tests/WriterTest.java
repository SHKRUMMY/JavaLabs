package Tests;
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
	public void testWriteToCSV() throws IOException {
		Writer writer = new Writer();
		writer.writeToFile(testStockMarket.getAvailiableSecurities(), "expected");

		Path actualPath = Paths.get("Securities.csv");
		Path expectedPath = Paths.get("expected.csv");

		List<String> actualString = Files.readAllLines(actualPath);
		List<String> expectedString = Files.readAllLines(expectedPath);

		Assert.assertEquals(actualString, expectedString);
	}

}
