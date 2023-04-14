package practice;

import java.util.Scanner;

public class Scanner_practice {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter value");
		int a=scn.nextInt();
		System.out.println("enter your date");
		boolean f=scn.hasNextLine();
		
		System.out.println("****************");
		System.out.println("int="+a);
		System.out.println("boolean="+f);
	
	
	}

}
