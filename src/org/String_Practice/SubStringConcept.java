package org.String_Practice;

public class SubStringConcept {
	
	public static void main(String[] args) {
		String str="welcome to hcl";
		//in sub string method start index start from zero
		// and end index start from one
		
		String s= str.substring(8,10);
		System.out.println(s);
		
		//trim method in string
		// remove first and last spaces from string
		String trm= "                 welcome to hcl       ";
		String t= trm.trim();
		System.out.println(t);
		System.out.println(t.startsWith("welcome"));
		System.out.println(t.endsWith("hcl"));
		
	}

}
