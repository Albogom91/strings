package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {

	public static void main(String[] args) {
		String sourceText = "Under the bold leadership of General Rommel,\n"
				+ "the Axis enjoyed startling successes, recapturing Libya and threatening Egypt.\n"
				+ "Yet, by late 1941, when Rommel's forces had overstretched their supply lines,\n"
				+ "they were forced to fall back in the face of a determined British offensive.\n"
				+ "In 1942 a revived Axis effort saw Rommel defeat the British at Gazala and capture Tobruk.\n";
		System.out.println("Source text:");
		System.out.println(sourceText);
		System.out.print("First in alphabetical order among longest words in the souce text is: ");
		System.out.println(findLongestWord(sourceText));
		
	}

	public static String findLongestWord(String str) {
		String regex = "\\b[\\w']+\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		String current = new String();
		String longest = new String();
		while(matcher.find()) {
			current = matcher.group();
			if(current.length() == longest.length()) {
				longest = longest.compareToIgnoreCase(current) <= 0 ? longest : current;
				continue;
			}
			if(current.length() > longest.length()) {
				longest = current;
			}
		}
		return longest;
	}
	
}
