package org.String_Practice;

public class Assignment_Split {

	public static void main(String[] args) {
		String str="mynameismanojpatil";

		String [] ar= str.split(" ");
		String upper = str.toUpperCase();

		for (int i=0; i<ar.length; i++) 
		{
			System.out.print(ar[i]);
		}
	}
}