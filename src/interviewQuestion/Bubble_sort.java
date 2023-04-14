package interviewQuestion;

public class Bubble_sort {

	public static void main(String[] args) {
		int ar[]= {25,-22,85,35,29,0};
		int temp=0;
		System.out.println("Bubble sort");
		System.out.println("Array length is "+ar.length);
		int i,j;
		
		for (i=0; i<ar.length; i++) 
		{
			System.out.println("ar["+i+"]= "+ar[i]);
		}
		for (i=0; i<ar.length; i++)
		{
			for (j=0; j<ar.length; j++) 
			{
				if(ar[i]>ar [j])
				{
					temp=ar [i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("after bubble sort(Descending)");
		for (i=0; i<ar.length; i++)
		{
			System.out.println("ar["+i+"]=" +ar[i]);
		}
	}
}
// if the first element greater than second element ,it will swap both element 
//and then move on to compare the second and third and so on...