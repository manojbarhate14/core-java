package interviewQuestion;

public class OddAndEven {

	public static void main(String[] args) {
		int n=50;
		System.out.println(" Even Number\n");
		for(int i=0;i<=n; i++)
		{
			if(i%2!=0) 
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n Odd Number");
		
		for(int i=0; i<=n; i++)
		{
			if(i%2==0)
				{
					System.out.print(i+" ");
				}
			}
		}

	}


