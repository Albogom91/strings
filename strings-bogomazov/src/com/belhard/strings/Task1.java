package com.belhard.strings;

public class Task1 {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "firstVariable, secondVariable, thirdVariable";
		strArray[1] = "newVariableFormedFromOld";
		strArray[2] = "toAStringFromALine";
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(transformFromCamelToSnake(strArray[i]));
		}
		
	}
	
	public static String transformFromCamelToSnake(String str) {
		String regex = "([a-z])([A-Z])";
		String replacement = "$1_$2";
		str = str.replaceAll(regex, replacement);
		regex = "([A-Z])([A-Z])";
		replacement = "$1_$2";
		str = str.replaceAll(regex, replacement).toLowerCase();
		return str;
		
	}

}
