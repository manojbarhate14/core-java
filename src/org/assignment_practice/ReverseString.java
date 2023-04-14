package org.assignment_practice;

public class ReverseString {

	public static void main(String[] args) {
		String str= "manoj suresh barhate";
		System.out.println("length= "+str.length());
		System.out.println();
		
		String reverse ="";
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
			
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		if (reverse.contains("etahrab erus jonam")) {
			System.out.println("succesfull");
		}

	}

}
