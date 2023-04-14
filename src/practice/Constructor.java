package practice;

public class Constructor {
	public Constructor(float a , float b) {
		float sum =a+b;
		System.out.println("argument= "+sum);
	}

	public static void main(String[] args) {
		Constructor obj= new Constructor (10.55f,20.15f);
	}
}
