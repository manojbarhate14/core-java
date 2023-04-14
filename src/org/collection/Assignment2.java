package org.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment2 
{
	public void arraylist1() 
	{
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("one");
		ar.add("two");
		ar.add("three");
		ar.add("four");
		ar.add("five");
		ar.add("six");
		System.out.println("ArrayList");
		System.out.println(ar);
		System.out.println();
		
		System.out.println("Convert ArrayList into Array");
		Object b[]= ar.toArray();
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}System.out.println();
		System.out.println("Convert Array into ArrayList");
		ArrayList<Object> al =new ArrayList<Object>();
		Collections.addAll(al, b);
		System.out.println(al);
	}

	public static void main(String[] args) {
		Assignment2 obj =new Assignment2();
		obj.arraylist1();
	}
}
