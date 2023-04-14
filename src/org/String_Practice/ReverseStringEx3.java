package org.String_Practice;

public class ReverseStringEx3 {

	public static void main(String[] args) {
		String str= "i am tester";
		System.out.println("length of string= "+str.length());
		System.out.println();
		System.out.println(str);
		
		String reverse ="";
		for(int i=str.length()-1; i>=0; i--) 
		{
			System.out.print(str.charAt(i));
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("Reverse string: "+reverse);
		if(reverse.contentEquals("etahraB jonaM"))
		{
			System.out.println("Reverse string succesfull");
		}

	}

}
