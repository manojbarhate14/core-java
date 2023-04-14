package org.constructor_Practice;

public class ConstOverloading {
	int a;
	float x;
	
	public ConstOverloading(int a)  //para const.
	{
		this.a=a;  //initialized global variable with local
		System.out.println("para INT const"+a);
	}
	public ConstOverloading(float x)
	{
		this.x=x;
		System.out.println("para FLOAT"+x);
	}

	public static void main(String[] args) {
		ConstOverloading obj=new ConstOverloading(10);
		ConstOverloading obj2=new ConstOverloading(20.5f);

		System.out.println("global a="+obj.a);
		System.out.println("global b="+obj2.x);
	}
}
