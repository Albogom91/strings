package com.belhard.strings;

public class Task8 {

	public static void main(String[] args) {
			String source = "Mr. Owl ate my metal worm!";
			System.out.println("Source string:");
			System.out.println(source);
			System.out.println();
			System.out.print("Source string is a palindrome: ");
			System.out.println(isPalindrome(source));
			
		}

		public static String deleteSpacesAndPunctuation(String str) {
			String regex = "[\\s\\W_]+";
			str = str.replaceAll(regex, "");
			return str;
		}
		
		public static String insertBafterAInString(String str) {
			String regex = "(a)";
			str = str.replaceAll(regex, "$1b");
			return str;
		}
		
		public static boolean isPalindrome(String str) {
			str = deleteSpacesAndPunctuation(str).toLowerCase();
			StringBuilder sourceStrBuild = new StringBuilder(str).reverse();
			String check = sourceStrBuild.toString();
			boolean isPalindrome = str.equals(check) ? true : false;
			return isPalindrome;
		}

	}


