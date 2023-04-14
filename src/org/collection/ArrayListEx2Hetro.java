package org.collection;

import java.util.ArrayList;

public class ArrayListEx2Hetro {
	
	public void heterogeneous1() 
	{
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		System.out.println("******Integer*****");
		ar1.add(45);
		ar1.add(100);
		System.out.println(ar1);
	}
	public void heterogeneous2() {
		ArrayList<String> ar1= new ArrayList<String>();
		System.out.println("******String*****");
		ar1.add("manoj");
		ar1.add("Patil");
		System.out.println(ar1);
	}
	public void heterogeneous3() {
		ArrayList<Double> ar1=new ArrayList<Double>();
		System.out.println("******Double*****");
		ar1.add(10.5);
		ar1.add(25.5);
		System.out.println(ar1);
	}

	public static void main(String[] args) 
	{
		ArrayListEx2Hetro obj =new ArrayListEx2Hetro();
		obj.heterogeneous1();
		obj.heterogeneous2();
		obj.heterogeneous3();
	}
}
