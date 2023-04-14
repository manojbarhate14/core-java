package interviewQuestion;

public class DuplicateElement {

	public static void main(String[] args) {
		int ar[]= {5,678,89,3,5,7,9,6,6,5,8,9,4,7};


		System.out.println("Duplicate Element In array");
		for (int i=0; i<ar.length; i++) 
		{
			for (int j=i+1; j<ar.length; j++) 
			{
				if(ar[i]==ar[j]) 
				{
					System.out.print(ar[j]+" ");
				}
			}
		}
	}

}
