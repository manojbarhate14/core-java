package practice;

public class Count_Occurence2 {

	public static void main(String[] args) {
		String str="i love my country very much";
		System.out.println(str.length());
		System.out.println(str);
		
		char letter='o';
		int  count=0;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==letter) count++;
		}
		System.out.println("letter "+letter+" occurs "+count+" time");

	}

}
