package com.string_handling;

public class StringParsing {
	public static void main(String[] args) {
		String str1 = "JavaBasics";
		String str2 = "Java";
		boolean ans = str1.contains(str2);
		
		System.out.println(ans);
		
		String s1 = "भारताने कसोटी जिकली.";
		String s2 = "भारत";
		boolean ans2 = s1.contains(s2);
		System.out.println(ans2);
		
		String keyword = parseSubstringAndGetKeyword(s1, s2);
		System.out.println(keyword);
		
		keyword = parseSubstringAndGetKeyword(s1, "कस");
		System.out.println(keyword);
		
	}
	
	public static String parseSubstringAndGetKeyword(String originalString, String parsingString){
		String keyword = "";
		String[] splitOriginalString = originalString.split(" ");
		for(String str : splitOriginalString){
			if(str.contains(parsingString)){
				keyword = str;
				break;
			}
		}
		return keyword;
	}
}