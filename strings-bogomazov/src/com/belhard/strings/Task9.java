package com.belhard.strings;

public class Task9 {

	public static void main(String[] args) {
		String source = "Caesar non supra grammaticos.";
		System.out.println("Source string:");
		System.out.println(source);
		char c = 'a';
		System.out.printf("How many times '%c' is encountered in \"%s\": ", c, source);
		System.out.printf("%d times", countSymbolInString(c, source));
	}
	
	public static int countSymbolInString(char c, String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
