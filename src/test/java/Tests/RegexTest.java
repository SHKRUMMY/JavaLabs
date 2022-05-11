package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lviv.iot.lab2.Regex.Regex;

import junit.framework.Assert;

public class RegexTest {
	@Test
	public void testRegexFindAndReplace() {
	Regex regex = new Regex();
	Scanner scanner = new Scanner(System.in);
	String content1 = scanner.nextLine();
	String expectedString = "word word word";
	assertEquals(expectedString, regex.regexFindAndReplace(content1));
//	String content2 = scanner.nextLine();
//	assertEquals("word word book", regex.regexFindAndReplace(content2));
	}
}
