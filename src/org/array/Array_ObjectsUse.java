package org.array;

public class Array_ObjectsUse {

	public static void main(String[] args) {
		// object allow type data can store to all data
		
		Object a[]=new Object [4];
		
		a[0]=10;
		a[1]="manoj";
		a[2]=true;
		a[3]=30.5;
		
		int size=a.length;
		
		for(int i=0; i<size; i++) {
			System.out.println("a["+i+"]= "+a[i]);
		}

	}

}
