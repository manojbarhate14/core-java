package interviewQuestion;

public class Assignment_CountOccurence {

	public static void main(String[] args) {
		String str = "my hobbies is playing cricket and drawing";
		char letter = 'i';
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == letter)
				count++;
		}
		System.out.println("character " + letter + " appear " + count + " time in String");
	}

}
