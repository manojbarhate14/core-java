package org.collection;
import java.util.ArrayList;
import java.util.ListIterator;

public class SetEx2 {
	
	public void setmethod() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("Gangtok");
		str.add("Manali");
		str.add("Ladakh");
		str.add("Andaman");
		str.add("Goa");
		
		System.out.println(str);
		
		ListIterator<String> itr = str.listIterator();
		System.out.println("Has Previous :"+itr.hasPrevious());
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Previous :"+itr.previous());
		System.out.println("Has Previous :"+itr.hasPrevious());	
	}

	public static void main(String[] args) {
		SetEx2 obj =new SetEx2();
		obj.setmethod();

	}

}
