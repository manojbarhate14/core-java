package org.collection;

import java.util.ArrayList;

public class ArrayListEx1Homo {
	
	public void homogeneous() {
		ArrayList<Object> ar1=new ArrayList<Object>();
		ar1.add("manoj");
		ar1.add(1.5);
		ar1.add(20.5f);
		ar1.add(450000);
		
		System.out.println(ar1);
		System.out.println(ar1.get(2));
		ar1.ensureCapacity(2);
		System.out.println(ar1.contains(1.5));
		System.out.println(ar1.clone());
		ar1.remove(3);
		System.out.println("remove 3rd index: "+ar1);
		ar1.set(2, 500);
		System.out.println("set index 3 value:"+ar1);
	
	}

	public static void main(String[] args) {
		ArrayListEx1Homo obj=new ArrayListEx1Homo();
		obj.homogeneous();

	}

}
//in collection we are store homogeneous as well as heterogeneous data
