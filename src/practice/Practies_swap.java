package practice;

public class Practies_swap {
	public void swap(float a,float b) {
		
		a=a*b;
		b=a-b;
		a=a-b;
		System.out.println("swap="+a);
		System.out.println("swap="+b);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("program start");
		
		System.out.println("with using two variable");
		Practies_swap obj=new Practies_swap();
		obj.swap(4,9);
		
	}
	
	
	
	
}
	
