package com.belhard.strings;

public class Task6 {

	public static void main(String[] args) {
		String source = "World   -awesome!    Hello, my darling       world!!!";
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		System.out.print("Starting position of the longest interwal of spaces in the source string is: ");
		System.out.println(findStartingPositiobnOfMostSpacesInString(source));
	}
	
	public static int findStartingPositiobnOfMostSpacesInString(String str) {
		char[] charArray = str.toCharArray();
		int maxCount = -1;
		int count = 0;
		int maxStartingPosition = -1;
		for(int i = 0; i < charArray.length; i++) {
			while(charArray[i] == ' ' && i < charArray.length) {
				count++;
				i++;
			}
			if(count == 0) {
				continue;
			}
			if(count > maxCount) {
				maxCount = count;
				maxStartingPosition = i - count;
			}
			count = 0;
		}
		return maxStartingPosition;
	}

}
