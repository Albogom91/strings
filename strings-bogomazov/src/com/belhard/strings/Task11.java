package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {

	public static void main(String[] args) {
		String sourceText = "Under the bold leadership of General Rommel,\n"
				+ "the Axis enjoyed startling successes, recapturing Libya and threatening Egypt.\n"
				+ "Yet, by late 1941, when Rommel's forces had overstretched their supply lines,\n"
				+ "they were forced to fall back in the face of a determined British offensive.\n"
				+ "In 1942 a revived Axis effort saw Rommel defeat the British at Gazala and capture Tobruk.\n";
		System.out.println("Source text:");
		System.out.println(sourceText);
		System.out.print("Amount of lowercase lettes in the text: ");
		System.out.println(countLowercaseLetters(sourceText));
		System.out.print("Amount of uppercase lettes in the text: ");
		System.out.println(countUppercaseLetters(sourceText));
	}
	
	public static int countLowercaseLetters(String str) {
		String regex = "[a-z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while(matcher.find()) {
			count++;
		}
		return count;
	}
	
	public static int countUppercaseLetters(String str) {
		String regex = "[A-Z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while(matcher.find()) {
			count++;
		}
		return count;
	}

}
