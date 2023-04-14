package practice;

public class Ex2_method_practice {
	int a=20,b=30;
	static int  x=500,y=100,sum;
	
	public static void addition ()
	{
		
		Ex2_method_practice obj=new Ex2_method_practice();
		obj.sum=obj.a+obj.b;
		System.out.println("addition="+sum);
		
	
	}
	public static void main(String[] args) {
		System.out.println("addition start");
		//you call non static data from static block u need obj
		Ex2_method_practice obj=new Ex2_method_practice();
		obj.addition();
		
		
		//if you call static data from static block 
		//you have three option create obj,direct by name,class
		System.out.println(+x); 
		System.out.println(+y);
		
		
		System.out.println("addition end");
	}
	


	
}
