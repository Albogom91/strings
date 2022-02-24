package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static void main(String[] args) {
		String source = "12, 13, 15, 12547, 123, 67, 1";
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		System.out.print("Amount of numbers in source string is: ");
		System.out.println(countNumbersInString(source));
	}
	
	public static int countNumbersInString(String str) {
		String regex = "\\d+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while(matcher.find()) {
			count++;
		}
		return count;
	}

}
