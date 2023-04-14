package practice.loop;

public class SecondLagestElement {

	public static void main(String[] args) {
		int ar[]= {25,27,5,23,145,78,32,546};
		System.out.println("Given Array");
		int size=ar.length;
		int temp=0;
		System.out.println("Array length= "+size);

		for(int i=0; i<size; i++) 
		{
			System.out.println("ar["+i+"]= "+ar[i]);
		}
		System.out.println("after sorting ");
		//by selection sort
		for (int i=0; i<size; i++) 
		{
			for(int j=i+1; j<size; j++) 
			{
				if(ar[i]>ar[j]) 
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for (int i=0; i<size; i++)
		{
			System.out.println("ar["+i+"] ="+ar[i]);
		}
		System.out.println("second lagrest number in array="+ar[size-2]);
	}
}


