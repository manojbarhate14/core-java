package org.collection;
import java.util.ArrayList;

public class ArrayListEx4 {
	public void arraymethod() 
	{
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add("ajay");
		ar.add("atul");
		ar.add("8087");
		ar.add("ajay");
		ar.add(null);
		ar.add(null);
		
		for(Object obj : ar)
			System.out.println(obj);
		System.out.println("******************");
		
		ArrayList<Object> ar1=new ArrayList<Object>();
		ar1.add("virat");
		ar1.add("rahul");
		ar1.add("sehwag");
		ar1.add("1439");
		
		for(Object obj : ar1)
			System.out.println(obj);
		System.out.println("***********************");
		
		boolean flag= ar.contains("ajay");
		System.out.println("ajay present in ar :"+flag);
		boolean flag1= ar.containsAll(ar1);
		System.out.println("ar1 present in ar :"+flag1);
	}

	public static void main(String[] args) {
		ArrayListEx4 obj =new ArrayListEx4();
		obj.arraymethod();

	}

}