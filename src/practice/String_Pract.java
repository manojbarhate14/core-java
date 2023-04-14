package practice;

public class String_Pract {
	public void Loop() {
		
		for (char i='a'; i<='z'; i++) {
			if (i=='m')
				
			break;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		String_Pract obj=new String_Pract();
		obj.Loop();

	}

}
