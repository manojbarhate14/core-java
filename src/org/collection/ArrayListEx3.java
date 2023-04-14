package org.collection;

import java.util.ArrayList;

public class ArrayListEx3 {
	public void arraymethod() {
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add("akshay");
		ar.add("salman");
		ar.add("8087");
		ar.add("1393");
		System.out.println(ar);
		System.out.println("******************");
		int size=ar.size();
		System.out.println("size of array= "+size);
		System.out.println("******************");
		for(int i=0; i<size; i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("****after add new value in arraylist****\n");
		ar.add(1, "vijay");
		ar.add(3, "manoj");
		for(Object obj:ar) //for each loop
		{
			System.out.println(obj);
		}
		System.out.println("********************");
		System.out.println(ar.get(4));
	//	int pincode= ar.get(4);  you cannot convert string into integer
		int pincode = Integer.valueOf(4);
		
	}
	public static void main(String[] args) {
		ArrayListEx3 obj =new ArrayListEx3();
		obj.arraymethod();

	}
}
