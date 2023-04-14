package practice;

public class CountOccurence {

	public static void main(String[] args) {
		String str ="math book coppy so clear as per other book";
		System.out.println("length of string ="+str.length());

		char letter ='o';
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==letter) count++;
		}
		System.out.println("leterr "+letter+" appear at "+count+" time");

	}

}
