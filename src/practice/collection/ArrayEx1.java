package practice.collection;

import java.util.ArrayList;

public class ArrayEx1 {
	
	public void homo() {
		ArrayList<Object> ar =new  ArrayList<Object>();
		ar.add("manoj");
		ar.add("mayuri");
		ar.add("ravindra");
		ar.add("jayesh");
		ar.add("mukesh");
		System.out.println("first way to print array\n");
		System.out.println(ar);
		System.out.println();
		System.out.println("second way to print array");
		// By using for each loop
		for (Object obj:ar) {
			System.out.println(obj);
		}
		ar.remove("jayesh");
		ar.toArray();
		System.out.println("In array ="+ar);
		
		
		System.out.println("after remove jayesh"+ar);
		System.out.println("clone of array: "+ar.clone());
		
		System.out.println("manoj contains in array: "+ar.contains("manoj"));
		}

	public static void main(String[] args) {
		ArrayEx1 obj= new ArrayEx1();
		obj.homo();
		

	}

}
