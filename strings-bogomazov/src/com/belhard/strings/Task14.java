package com.belhard.strings;

public class Task14 {

	public static void main(String[] args) {
		String source = "ab=c +cde d.\\ef abzcc   !125151  55/////weqwe   yewyhwye**";
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		
		System.out.println("Source string without duplicate symbols, spaces and punctuation:");
		System.out.println(removeLetterRepetitionSpacesPunctuation(source));
		
	}
	
	public static String removeLetterRepetitionSpacesPunctuation(String str) {
		str = removeSpaces(str);
		str = removePunctuation(str);
		str = removeSymbolRepetition(str);
		return str;
	}

	public static String removeSymbolRepetition(String str) {
		StringBuilder uniqueSymbols = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(!uniqueSymbols.toString().contains(String.valueOf(str.charAt(i)))) {
				uniqueSymbols = uniqueSymbols.append(str.charAt(i));
			}
		}
		str = uniqueSymbols.toString();
		return str;
	}
	
	public static String removePunctuation(String str) {
		String regex = "[\\W_]+";
		str = str.replaceAll(regex, "");
		return str;
	}
	
	public static String removeSpaces(String str) {
		String regex = "\\s+";
		str = str.replaceAll(regex, "");
		return str;
	}
}
