package practice.loop;

public class ConstructorCall {
	public ConstructorCall (){
		System.out.println("manoj");
		
	}
	public ConstructorCall(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		ConstructorCall obj= new ConstructorCall();
		ConstructorCall obj1= new ConstructorCall(20);
		

	}

}
