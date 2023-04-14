package interviewQuestion;

public class Assignment_addition_of_stringDigit {

	public static void main(String[] args) 
	{
		String Input="th15ere 42is gard31ern";
		System.out.println("String is:\n "+Input);
		System.out.println();
		System.out.println("String length= "+Input.length());

		int sum=0;
	
		for (int i=0; i<Input.length(); i++) 
		{
			if(Character.isDigit(Input.charAt(i)))
				sum = sum+Character.getNumericValue(Input.charAt(i));
		}
		System.out.println("Sum of all number present in string \n= "+sum);
	}
}
//isDigit() => to check character is digit or not
//getNumericValue()=> return the int value

