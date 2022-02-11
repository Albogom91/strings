package com.belhard.strings;

import java.util.regex.*;

public class Task3 {

	public static void main(String[] args) {
		String source = "12, 13, 15, 12547, 123, 67, 1";
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		System.out.print("Amount of digits in source string is: ");
		System.out.println(countDigitsInString(source));
	}

	public static int countDigitsInString(String str) {
		String regex = "\\d";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while(matcher.find()) {
			count++;
			
		}
		return count;
	}
}
