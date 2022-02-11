package com.belhard.strings;

public class Task2 {

	public static void main(String[] args) {
		String source = "Tom Blackwall says Mike Black has blacK hair, new blACk wall and blackened eyes";
		
		System.out.println(replaceWordBlackWithWordWhite(source));
	}
	
	public static String replaceWordBlackWithWordWhite(String str) {
		String source = "\\bb(?i)lack\\b";
		String replacement = "white";
		str = str.replaceAll(source, replacement);
		return str;
	}

}
