package com.belhard.strings;

public class Task5 {

	public static void main(String[] args) {
		String source = "  World -     awesome !  Hello  ,  my darling   world   ! !        !     ";
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		System.out.println("Source string without extra spaces:");
		System.out.println(deleteExtraEmptySpaces(source));
	}
	
	public static String deleteExtraEmptySpaces(String str) {
		String regex = "\\s{2,}";
		str = str.replaceAll(regex, " ");
		regex = "\\s(?=[^-]\\W)";
		str = str.replaceAll(regex, "").trim();
		return str;
	}

}
