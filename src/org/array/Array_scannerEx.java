package org.array;

import java.util.Scanner;


public class Array_scannerEx {
	public void array_scaner() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size of array");
		int length=scn.nextInt();
		int ar[] =new int[length];
		System.out.println("enter integer ");
		for(int i=0; i<length; i++) 
		{
			ar[i]=scn.nextInt();
		}
		System.out.println("***************");
		for(int i=0;i<length;i++) {
			System.out.println("ar["+i+"]="+ar[i]);
		}
		System.out.println("Array size="+ar.length);
	}
	

	public static void main(String[] args) {
		Array_scannerEx obj=new Array_scannerEx();
		obj.array_scaner();

	}

}
