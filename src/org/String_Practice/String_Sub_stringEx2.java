package org.String_Practice;

public class String_Sub_stringEx2 {

	public static void main(String[] args) {
		String str="my name is ";
		str = str.concat("manoj");
		
		System.out.println(str);
		System.out.println();
		System.out.println("length of string: "+str.length());
		System.out.println();
		
		System.out.println("Starts with: "+str.startsWith("my"));
		System.out.println("End with: "+str.endsWith("manoj"));
		System.out.println("***********");
		
		String subtest=str.substring(11);
		System.out.println(subtest);
		String subtest1=str.substring(2,16);
		System.out.println(subtest1);
		System.out.println("********");
		
		System.out.println("contain: "+str.contains("manoj"));
		System.out.println("contain: "+str.contains("Home"));
		
		str=" "+str+" ";
		System.out.println(str);
		System.out.println(str.trim());
	}

}
//concat => is stand for concatenation
//startWith() => it check true or false of starting of string
//endWith() => it check true or false of ending of string
//substring() => for only specific length you have output of string
//contain() => for check string contain present or not/ right or wrong
//trim() => for trimming the starting or ending space