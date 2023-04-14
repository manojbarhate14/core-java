package org.assignment_practice;

import java.util.Scanner;

public class Palindrome_Number 
{

	public static void main(String[] args)
	{
		System.out.println("Enter Your Number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		System.out.println("Your Enter Number Is = "+num);

		int reverse=0, temp =num, r =0;

		while(temp>0) 
		{
			r= temp%10;
			reverse=reverse*10+r;
			temp= temp/10;
		}
		System.out.println("Reverse Number="+reverse);
		if (num==reverse) 
		{
			System.out.println("Number is palindrome");
		}else{
			System.out.println("number is not palindrome");
		}
	}
}
//palindrome number=> if you read the number from right to left or
//left to right, value of number is not change ex.141,535....