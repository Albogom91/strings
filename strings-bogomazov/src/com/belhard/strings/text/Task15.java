package com.belhard.strings.text;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task15 {

	public static void main(String[] args) {
		String source = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque eu lobortis elit. Phasellus libero neque, maximus nec sollicitudin sed, venenatis rhoncus ex.\n"
				+ "Proin in auctor erat. Curabitur et nisi imperdiet, tincidunt orci in, fringilla ligula. Nunc pulvinar pulvinar diam, ut pretium ligula fringilla cursus. Sed porttitor vulputate justo, quis dictum ex auctor id.\n"
				+ "Praesent ultricies ligula sed enim dignissim, vel malesuada purus semper. Maecenas luctus non urna id viverra.";
		
		
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		
		//System.out.println(sortParagraphs(source));
		//System.out.println(sortSentences(source));
		System.out.println(sortByCharacter(source, 'e'));
		
	}
	
	public static String sortParagraphs(String str) {
		String regex = ".+\n|\n.+\n|.+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		matcher.reset();
		String[] paragraphs = new String[count];
		count = 0;
		while (matcher.find()) {
			paragraphs[count++] = matcher.group().replaceAll("\n", "");
		}
		String temp = new String();
		for(int i = 0; i < paragraphs.length; i++) {
			for(int j = 1; j < paragraphs.length; j++) {
				if(countSentences(paragraphs[j - 1]) > countSentences(paragraphs[j])) {
					temp = paragraphs[j];
					paragraphs[j] = paragraphs[j - 1];
					paragraphs[j - 1] = temp;
				}
			}
		}
		str = String.join("\n", paragraphs);
		return str;
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
	
	public static String sortSentences(String str) {
		str = str.replaceAll("\n", " ");
		String regex = "[\\w|^,\\s]+[\\.?!]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		matcher.reset();
		String[] sentences = new String[count];
		count = 0;
		while (matcher.find()) {
			sentences[count++] = matcher.group().trim();
		}
		
		for (int i = 0; i < sentences.length; i++) {
			sentences[i] = sortWordsByLength(sentences[i]).toLowerCase();
		}
		
		str = String.join("\n", sentences);
		
		return str;
	}
	
	public static String sortWordsByLength(String str) {
		String regex = "\\b[\\w']+\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		matcher.reset();
		String[] words = new String[count];
		count = 0;
		while (matcher.find()) {
			words[count++] = matcher.group();
		}
		String temp = new String();
		for(int i = 0; i < words.length; i++) {
			for(int j = 1; j < words.length; j++) {
				if(words[j - 1].length() > words[j].length()) {
					temp = words[j];
					words[j] = words[j - 1];
					words[j - 1] = temp;
				}
			}
		}
		str = String.join(" ", words);
		return str;
	}
	
	public static String sortByCharacter(String str, char c) {
		str = str.replaceAll("\n", " ");
		String regex = "[\\w|^,\\s]+[\\.?!]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		matcher.reset();
		String[] sentences = new String[count];
		count = 0;
		while (matcher.find()) {
			sentences[count++] = matcher.group().trim();
		}
		
		for (int i = 0; i < sentences.length; i++) {
			sentences[i] = sortWordsByCharacter(sentences[i], c).toLowerCase();
		}
		
		str = String.join("\n", sentences);
		
		return str;
		
	}
	
	public static String sortWordsByCharacter(String str, char c) {
		String regex = "\\b[\\w']+\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		matcher.reset();
		String[] words = new String[count];
		count = 0;
		while (matcher.find()) {
			words[count++] = matcher.group();
		}
		String temp = new String();
		for(int i = 0; i < words.length; i++) {
			for(int j = 1; j < words.length; j++) {
				if(countSymbolInString(c, words[j - 1]) < countSymbolInString(c, words[j])) {
					temp = words[j];
					words[j] = words[j - 1];
					words[j - 1] = temp;
				}
				if(countSymbolInString(c, words[j - 1]) == countSymbolInString(c, words[j])) {
					if(words[j - 1].compareToIgnoreCase(words[j]) > 0) {
						temp = words[j];
						words[j] = words[j - 1];
						words[j - 1] = temp;
					}
				}
			}
		}
		str = String.join(" ", words);
		return str;
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
