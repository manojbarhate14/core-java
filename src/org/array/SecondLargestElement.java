package org.array;

public class SecondLargestElement {

	public static void main(String[] args) {
		System.out.println("2nd highest element through selection sort");
		int temp,size;
		int ar[]= {10,20,80,60,40,50};
		size=ar.length;
		System.out.println("Array length= "+ar.length);
		for(int i=0; i<ar.length; i++) 
		{
			System.out.print("ar["+i+"]="+ar[i]+",");
		}
		System.out.println();
		for(int i=0; i<size; i++) {
			for (int j=i+1; j<size; j++)
			{
				if (ar[i]>ar[j])    //Bubble sort
				{
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
	   }
		
		
		System.out.println("***After Sorting***");
		for(int i=0; i<ar.length; i++) 
		{
			System.out.print("ar["+i+"]="+ar[i]+", ");
		}
		System.out.println();
		System.out.println("Second Largest Element= "+ar[size-2]);
	}

}
