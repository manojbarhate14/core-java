package org.assignment_practice;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		//Reverse number or palindrone number logic same
		System.out.println("Please Enter Number");
		
		Scanner scn=new Scanner(System.in);
		int num= scn.nextInt();
		//int num =4555;
		System.out.println("your Number- "+num);

		int reverse =0, temp=num, r=0;

		while (temp>0)
		{
			r=temp%10;    //Reminder value
			reverse=reverse*10+r;
			temp=temp/10;

		}
		System.out.println("Reverse Number = "+reverse);
	}


}


