package interviewQuestion;

public class DuplicateNumPrint {

	public static void main(String[] args) {
		int ar[]= {1,2,1,2,3,4,5,1};

		System.out.println("Duplicate Element In array");
		for (int i=0; i<ar.length; i++) 
		{
			for (int j=0; j<ar.length; j++) 
			{
				if(ar[i]==ar[j]) 
				{
					System.out.print(ar[i]+" ");
				}
			}
		}
	}

}
