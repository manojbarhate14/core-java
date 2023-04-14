package org.array;

import java.util.Arrays;

public class CommonElement {

	public static void main(String[] args) {
		String array1[]= {"suraj", "manoj", "shubham", "ganesh"};
		String array2[]= {"ram", "vishnu","ganesh", "manoj"};

		
		for(int i=0; i<array1.length; i++) 
		{
			for(int j=0; j<array2.length; j++) 
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}
			}
		}
	
		
		
		int array3[]= {2,5,7,8,9};
		int array4[]= {5,2,7,4,6};

		
		for(int i=0; i<array3.length; i++) 
		{
			for(int j=0; j<array4.length; j++) 
			{
				if(array3[i]==array4[j]) 
				{
					System.out.println(array4[j]);
				}
			}
		}
	}

}
