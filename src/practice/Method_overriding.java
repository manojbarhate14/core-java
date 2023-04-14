package practice;

class A{
	
	public void show() {
		int a=25;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
		
	}
}

public class Method_overriding extends A {
	public void show() 
	{
		int a=0;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		Method_overriding obj=new Method_overriding();
		obj.show();
		

	}

}
