package org.collection;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment1 {
	public void arraylist1() {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(3);
		ar.add(2);
		ar.add(1);
		ar.add(5);
		ar.add(4);
		System.out.println("ArrayList");
		System.out.println(ar);
		System.out.println("Ascending sort");
		Collections.sort(ar);
		System.out.println(ar);
		System.out.println("Descending sort");
		Collections.reverse(ar);
		System.out.println(ar);

		System.out.println("****************\n");
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("B");
		ar1.add("A");
		ar1.add("C");
		ar1.add("E");
		ar1.add("D");
		System.out.println("ArrayList");
		System.out.println(ar1);
		System.out.println("Ascending sort");
		Collections.sort(ar1);
		System.out.println(ar1);
		System.out.println("Descending sort");
		Collections.reverse(ar1);
		System.out.println(ar1);
	}

	public static void main(String[] args) {
		Assignment1 obj =new Assignment1();
		obj.arraylist1();
	}
}