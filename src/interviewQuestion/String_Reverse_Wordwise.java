package interviewQuestion;

public class String_Reverse_Wordwise {

	public static void main(String[] args) {
		String str= "Selenium and Java";
		String a[]=str.split(" ");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
