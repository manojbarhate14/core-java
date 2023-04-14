package org.assignment_practice;

public class RepetedNumber {

	public static void main(String[] args) 
	{
		int ar[]= {10,22,10,15,35,42,22,10};

		System.out.println("Given Array");

		for(int i=0; i<ar.length; i++) 
		{
			System.out.println("ar["+i+"]= "+ar[i]);
		}
		System.out.println();
		System.out.println("Repeated Number In Array");
		for(int i=0; i<ar.length; i++) 
		{
			for(int j=i+1; j<ar.length; j++) 
			{ if(ar[i]==ar[j]) 
			{
				System.out.println(ar[j]);
			}
			}
		}

	}

}
