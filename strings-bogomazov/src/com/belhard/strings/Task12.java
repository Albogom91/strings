package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {

	public static void main(String[] args) {
		String sourceText = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.\n"
				+ "The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,\n"
				+ "as opposed to using 'Content here, content here', making it look like readable English.\n"
				+ "Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text,\n"
				+ "and a search for 'lorem ipsum' will uncover many web sites still in their infancy.\n"
				+ "Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n";
		System.out.println("Source text:");
		System.out.println(sourceText);
		System.out.print("Amount of sentences in the text is: ");
		System.out.println(countSentences(sourceText));
	}

	public static int countSentences(String str) {
		String regex = ".[\\.?!]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		return count;
	}
	
	//I have no idea how to distinguish Mr., Dr., etc. from sentences in source text.
}
