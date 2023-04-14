package org.condition_andLoop;

import java.util.Scanner;

public class If_else {

	public void  condition (int marks) {
		

		if  (marks>=78) 
		{
			System.out.println("Distinction marks="+78);

		}else if (marks>=65) {
			System.out.println("First class marks="+65);

		}else if (marks>=55)
		{
			System.out.println("Pass class marks="+55);

		}else  {
			System.out.println("Fail marks=<"+35);
		}
	}

	public static void main(String[] args) {
		System.out.println("**program start**");
		System.out.println();
		If_else obj=new If_else();
		obj.condition(78);
		obj.condition(65);
		obj.condition(55);
		obj.condition(35);
		System.out.println();
		System.out.println("**program end**");




	}

}
