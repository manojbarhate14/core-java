package org.scanner_switchcase;

import java.util.Scanner;

public class Arithmetic_input {

	public static void main(String[] args) {

		Scanner scr =new Scanner(System.in);
		System.out.println("Enter value a:");
		
		int a=scr.nextInt();
		System.out.println("Enter value b:");
		
		int b=scr.nextInt();
		System.out.println();
		System.out.println("Output:-");
		System.out.println();

		Arithmetic_operation obj=new Arithmetic_operation();
		obj.addition(a, b);
		obj.subtraction(a, b);
		obj.multiplication(a, b);
		obj.division(a, b);
	}

}
