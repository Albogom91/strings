package com.belhard.strings.xml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task16 {

	public static void main(String[] args) {
		String source = "<mails>\r\n"
				+ "\r\n"
				+ "<mail id=\"5262\">\r\n"
				+ "\r\n"
				+ "<to>Mike</to>\r\n"
				+ "\r\n"
				+ "<from>Andrew</from>\r\n"
				+ "\r\n"
				+ "<subject>Discussion – ACA Integration</subject >\r\n"
				+ "\r\n"
				+ "<body>Tomorrow we will have a meeting with ACA leadership and will discuss integration process and related issues</body>\r\n"
				+ "\r\n"
				+ "</mail>\r\n"
				+ "\r\n"
				+ "<mail id=\"24264\">\r\n"
				+ "\r\n"
				+ "<to>Mary</to>\r\n"
				+ "\r\n"
				+ "<from>Mary</from>\r\n"
				+ "\r\n"
				+ "<subject>Call Jim tmrw</subject >\r\n"
				+ "\r\n"
				+ "<body/>\r\n"
				+ "\r\n"
				+ "</note>\r\n"
				+ "\r\n"
				+ "</notes>";
		
		System.out.println("Source string:");
		System.out.println(source);
		System.out.println();
		showAllTags(source);
		System.out.println();
		showOpeningTags(source);
		System.out.println();
		showClosingTags(source);
		System.out.println();
		showContent(source);
	}
	
	public static void showAllTags(String str) {
		String regex = "(<.[^(/><.)]+>)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		System.out.println("All tags:");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		
	}
	
	public static void showOpeningTags(String str) {
		String regex = "(<[^/].[^(/><.)]+>)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		System.out.println("Opening tags:");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
	public static void showClosingTags(String str) {
		String regex = "(</.[^(/><.)]+>)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		System.out.println("Closing tags:");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
	public static void showContent(String str) {
		String regex = ">.*<";
		String regexTags = "[<>]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		System.out.println("Content:");
		pattern = Pattern.compile(regex);
		while(matcher.find()) {
			System.out.println(matcher.group().replaceAll(regexTags, ""));
		}
	}

}
