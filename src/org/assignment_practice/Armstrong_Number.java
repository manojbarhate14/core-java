package org.assignment_practice;

import java.util.Scanner;

public class Armstrong_Number 
{

	public static void main(String[] args)
	{
		System.out.println("enter your number");
		Scanner scn= new Scanner(System.in);
		int num =scn.nextInt();

		System.out.println("your number is="+num);

		int arm=0, div=num, remind=0;
		while(div>0) 
		{
			remind= div%10;
			arm=arm+remind*remind*remind;
			div=div/10;
		}
		
		if(num==arm) {
			System.out.println("your number is armstrong");
		}else {
			System.out.println("your number is not armstrong");
		}
	}
}
// Ex. 153=> 1^3 + 5^3 + 3^3=153