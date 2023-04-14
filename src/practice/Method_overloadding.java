package practice;

public class Method_overloadding {
	
	public void sum(int a, int b,int c) {
		System.out.println("1= "+a+b+c);
		
	}
	public void sum(int a, float b) {
		System.out.println("2= "+a+b);
	}
	public void sum(int a, int b) {
		System.out.println("3= "+(a+b));
		
	}

	public static void main(String[] args) {
		Method_overloadding obj=new Method_overloadding();
		obj.sum(10, 20.5f);

	}

}
