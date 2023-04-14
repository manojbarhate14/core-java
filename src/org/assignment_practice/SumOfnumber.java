package org.assignment_practice;

import java.util.Scanner;

public class SumOfnumber {

	public static void main(String[] args) {
		int number, digit,sum=0;

		Scanner scn =new Scanner(System.in);
		System.out.println("Enter your number");
		number = scn.nextInt();

		while(number>0)
		{
			digit = number %10;
			sum=sum+digit;
			number = number /10;
		}
		System.out.println("sum of Digit :"+sum);
	}
}

