package org.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(105);
		ar.add(302);
		ar.add(205);
		ar.add(405);
	//	ar.add("manoj");
		for (Object obj: ar)
		{
			System.out.println(obj);
		}
		
		Collections.sort(ar);
		System.out.println("ascending sorting");
		for (Object obj: ar)
		{
			System.out.println(obj);
		}
		
		Collections.reverse(ar);
		System.out.println("descending sort");
		for(Object obj:ar)
		{
			System.out.println(obj);
		}
		Collections.shuffle(ar);
		System.out.println("shuffle");
		for(Object obj: ar) {
			System.out.println(obj);
		}

	}

}
