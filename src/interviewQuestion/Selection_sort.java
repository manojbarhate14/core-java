package interviewQuestion;

public class Selection_sort {

	public static void main(String[] args) {
		int ar[]= {15, -25, 30, 28, 45, 38};
		int temp=0;

		System.out.println("Selection sort");
		System.out.println("Array length is "+ar.length);
		int i,j;
		for ( i=0; i<ar.length; i++) 
		{
			System.out.println("ar["+i+"]="+ar[i]);
		}
		for( i=0; i<ar.length; i++) 
		{
			for(  j=i+1; j<ar.length; j++)
			{
				if(ar[i]>ar[j]) 
				{
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After selection sort(Ascending)");
		for ( i=0; i<ar.length; i++) 
		{
			System.out.println("ar["+i+"]="+ar[i]);
		}
	}
}
