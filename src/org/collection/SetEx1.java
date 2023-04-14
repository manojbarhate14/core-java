package org.collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {
	
	public void setmethod() {
		HashSet<Integer>h1 = new HashSet<Integer>();
		h1.add(100);
		h1.add(350);
		h1.add(154);
		h1.add(256);

		
		System.out.println("Size = "+h1.size());
		System.out.println(h1);
		
		for(Object obj:h1) 
		{
			System.out.println(obj);
		}
		System.out.println("*****************");
		
		Iterator<Integer> itr = h1.iterator();
		System.out.println("Has next : "+itr.hasNext());
		System.out.println("Next element : "+itr.next());
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		SetEx1 obj=new SetEx1();
		obj.setmethod();
	}
}
