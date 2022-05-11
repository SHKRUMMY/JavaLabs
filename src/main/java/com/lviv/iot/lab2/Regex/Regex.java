package com.lviv.iot.lab2.Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public String regexFindAndReplace(String stringToReplace) {
		
		Pattern replace = Pattern.compile("[bcdfghjklmnpqrstvwxyz]{3}", Pattern.CASE_INSENSITIVE);
		Matcher matcher = replace.matcher(stringToReplace.trim());
		String result = "";
		
		while(matcher.find()) {
			result = stringToReplace.replaceAll("([bcdfghjklmnpqrstvwxyz]{3,}[a-z]{0,})", "word");
		}
		  
		return result;
		}
}