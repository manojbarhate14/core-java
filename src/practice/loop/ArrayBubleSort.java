package practice.loop;

public class ArrayBubleSort {

	public void bublesort(){
		int ar[]= {24,35,14,26,12,32,54,32,54,35};
		int temp=0;
		int i,j;
		System.out.println("Length of array ="+ar.length);
		for( i=0; i<ar.length; i++) {
			System.out.println("ar ["+i+"] = "+ar[i]);
		}
		System.out.println("After buble sorting");
		for( i=0; i<ar.length; i++) 
		{
			for(j=0; j<ar.length;j++) 
			{
				if(ar[i]>ar[j]) 
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}

			}
		}
		for(i=0; i<ar.length; i++)
		{
			System.out.println("ar ["+i+"] = "+ar[i]);

		}
	}
	public static void main(String[] args) {
		ArrayBubleSort obj= new ArrayBubleSort();
		obj.bublesort();




	}

}
