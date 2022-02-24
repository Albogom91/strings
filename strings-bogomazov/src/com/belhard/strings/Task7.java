package com.belhard.strings;

public class Task7 {

	public static void main(String[] args) {
		String source = "Acta non verba. Sapere aude.";
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		System.out.println("Source string with 'b' after each 'a':");
		System.out.println(insertBafterAInString(source));
	}
	
	public static String insertBafterAInString(String str) {
		String regex = "(a)";
		str = str.replaceAll(regex, "$1b");
		return str;
	}
	
}
