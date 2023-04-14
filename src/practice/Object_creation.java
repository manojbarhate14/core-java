package practice;

public class Object_creation {
    int aa=25;
	int bb=50;
	
	
	
	public static void main(String[] args) {
		Object_creation obj=new Object_creation();
		System.out.println("aa="+obj.aa);
		System.out.println("bb="+obj.bb);
		
		
		Object_creation obj1=new Object_creation();
		obj1.aa=100;
		obj1.bb=200;
		 
		System.out.println("aa="+obj1.aa);
		System.out.println("bb="+obj1.bb);
		
		System.out.println();
		
		
		
	}

}
