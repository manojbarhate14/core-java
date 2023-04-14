package org.scanner_switchcase;

import java.util.Scanner;

public class Scanner_class_ex1 {

	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter int a:");
		int a=scr.nextInt();
		
		System.out.println("Enter float value:");
		float b=scr.nextFloat();
		
		System.out.println();
		System.out.println("int ="+a);
		System.out.println("float ="+b);
		

	}

}
