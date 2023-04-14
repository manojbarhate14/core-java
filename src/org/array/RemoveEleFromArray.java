package org.array;

public class RemoveEleFromArray {

	public static void main(String[] args) {
		int ar []=new int[4];
		ar[0]=15;
		ar[1]=20;
		ar[2]=32;
		ar[3]=45;
		System.out.println("Array");
		for(Object obj: ar) 
		{
			System.out.println(obj);
		}
		System.out.println("After Remove Element");
		
		int del=32;int j = 0; int count= 0;
		for(int i=0; i<ar.length; i++) 
		{
			if(del==ar[i])
			{
				ar[j]=ar[j+1];
			}
			count =count+1;
			break;
		}
		for (int i=0; i<ar.length; i++) 
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
