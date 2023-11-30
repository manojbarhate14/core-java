package interviewQuestion;

public class SelectionAndBubbleSort {

	public static void main(String[] args) {
		int ar[]= {15, -25, 30, 28, 45, 38};
		int temp;

		System.out.println("Array length is "+ar.length);
		int i,j;
		for(i=0; i<ar.length; i++) 
		{
			for(j=i; j<ar.length; j++)
			{
				if(ar[i]>ar[j]) 
				{
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("After selection sort");
		System.out.println();
	}
}
