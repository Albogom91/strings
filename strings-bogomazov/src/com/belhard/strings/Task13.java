package com.belhard.strings;

public class Task13 {

	public static void main(String[] args) {
		String source = "Acta non verba. Sapere aude.";
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		
		System.out.println("Source string with dplicated symbols:");
		System.out.println(duplicateAllSymbols(source));
	}
	
	public static String duplicateAllSymbols(String str) {
		StringBuilder duplicated = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			duplicated = duplicated.append(String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i)));
		}
		str = duplicated.toString();
		return str;
	}

}
