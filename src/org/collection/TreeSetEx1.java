package org.collection;

import java.util.TreeSet;

public class TreeSetEx1 {
	
	public void set() {
		//Treeset maintain Ascending order
		TreeSet<Integer> tr= new TreeSet<Integer>();
		tr.add(450);
		tr.add(205);
		tr.add(366);
		tr.add(500);
		tr.add(325);
		tr.add(236);
		
		System.out.println(tr);
		System.out.println("***Using For Each loop");
		for (Object o:tr) {
			System.out.println(o);
		}
		System.out.println("size :"+tr.size());
		System.out.println("class name :"+tr.getClass());
		System.out.println("1st element :"+tr.first());
		System.out.println("last element :"+tr.last());
		System.out.println("contains 205 :"+tr.contains(205));
		System.out.println("clone set :"+tr.clone());
		System.out.println("Convert treeset into array");
		Object b[]=tr.toArray();
		for (int i=0; i<b.length; i++) 
		{
			System.out.println(b[i]);
		}
		tr.remove(500);
		System.out.println("after remove 500 :"+tr);
	}

	public static void main(String[] args) {
		TreeSetEx1 obj =new TreeSetEx1();
		obj.set();
	}

}
