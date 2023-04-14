package practice.collection;

import java.util.ArrayList;

public class ArryListEx2 {

	public static void main(String[] args) {
		ArrayList<Object> array	= new ArrayList<Object>();
		array.add(15);
		array.add("manoj");
		array.add(50.3);
		array.add("Nashik");
		
		System.out.println(array);
		System.out.println("using for each loop");
		for(Object obj: array) {
			System.out.println(obj);
		}
//		array.clear();
//		for(Object obj: array) {
//			System.out.println(obj);
//		}
		array.clone();
		System.out.println("after clone");
		for(Object obj: array) {
			System.out.println(obj);
		}
		
		System.out.println("contain method");
		System.out.println(array.contains("manoj"));
		
	}

}
