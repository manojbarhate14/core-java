package org.array;

public class Array_one_dimensional {
	
	public void arraymethod()
	{
		//int [] ar = {50,10,-40};
		int [] ar= new int [3];  //In bracket shows length of array
		ar [0] = 50;
		ar [1] = 10;
		ar [2] = -40;
		
	 // ar [3]=500;;  //run time error bcz our array length is only 3

		System.out.println("array length="+ar.length);
		for(int i=0; i<ar.length; i++) 
		{
			System.out.println("ar ["+i+"] = "+ar[i]);
		}
	}
	public static void main(String[] args) {
		Array_one_dimensional obj =new Array_one_dimensional();
		obj.arraymethod();
	}

}


