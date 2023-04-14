package org.collection;

import java.util.ArrayList;

public class SetEx3 {
	public void setmethod() {
		ArrayList<String> str = new ArrayList<String>();
		// Array is autoIndexing start from zero
		str.add("Gangtok");
		str.add("Manali");
		str.add("Ladakh");
		str.add("Andaman");
		str.add("Goa");

		System.out.println("size or arraylist :"+str.size());
		System.out.println(str);
		System.out.println("Length of String:"+str.get(1).length());
		System.out.println("String letter Index :"+str.get(1).indexOf("a"));
		System.out.println("******************");

		String ar= str.get(0);
		System.out.println("ar length :"+ar.length());
		System.out.println("ar Index :"+ar.indexOf("o"));
		System.out.println("******************");
		
		if (str.get(0).equals(str.get(4))){
			System.out.println("Right");
		}else {
			System.out.println("Wrong");
		}
		if(str.get(0).equals("Gantok"));{
			System.out.println("Gantok-Gantok");
		}

	}

	public static void main(String[] args) {
		SetEx3 obj=new SetEx3();
		obj.setmethod();
	}

}
