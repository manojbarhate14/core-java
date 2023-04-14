package org.collection;
import java.util.ArrayList;

public class ArrayListEx5 {
	public static void main(String[] args) {
		ArrayList<Object> ar= new ArrayList<Object>();
		ar.add("rohit");
		ar.add("ajay");
		ar.add("atul");
		ar.add("manoj");
		ar.add(11.25);
		for(Object obj: ar) {
			System.out.println(obj);
		}System.out.println("*********************");
		ar.remove(2);
		System.out.println("After remove index 2(atul)");
		for(Object obj: ar) {
			System.out.println(obj);
		}
		System.out.println("********************");
		ArrayList<Object> ar1= new ArrayList<Object>();
		ar1.add("sehwag");
		ar1.add(1056);
		ar1.add(10.25);
		ar1.add("manoj");
		ar1.add("atul");
		ar1.add("ajay");

		for(Object obj: ar1) {
			System.out.println(obj);
		}ar.removeAll(ar1);
		System.out.println("******After remove all method use");
		for(Object obj: ar) {
			System.out.println(obj);
		}
	}
}

