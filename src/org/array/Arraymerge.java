package org.array;

public class Arraymerge {

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4};
		int ar2[]= {5,6,7,8};
		
		int ar3=ar1.length;
		int ar4=ar2.length;
		
		int result= ar3+ar4;
		
		int[] arraynew= new int[result];
		
		for(int i=0; i<ar3; i=i+1) {
			arraynew[i]=ar1[i];
		}
		for (int i=0; i<ar4; i=i+1) {
			arraynew[ar3+i]=ar2[i];
		}
		
		for (int i=0; i<result; i=i+1) {
			System.out.println(arraynew[i]);
		}
		

	}

}
