package org.array;

import java.util.Scanner;

// one dimensional array type
public class Array_Ex1 {
	public void array_ex1() {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter size of array");
		int length = scn.nextInt();

		int [] ar =new int[length];
		System.out.println("enter array integer");
		for(int i=0; i<length; i++)
		{
			ar[i] = scn.nextInt();
		}
		System.out.println("******************");
		System.out.println("array length="+ar.length);
		for(int i=0; i<ar.length; i++) 
		{
			System.out.println("ar [" +i + "] = " +ar [i]);
		}
	}
	public static void main(String[] args) {
		Array_Ex1 obj =new Array_Ex1();
		obj.array_ex1();
	}
}