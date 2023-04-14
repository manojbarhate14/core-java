package org.ExceptionHandling;

public class NFE 
{

	public void numberexeption() 
	{
		String str="Manoj";
		try 
		{
			int a=Integer.parseInt(str);
			System.out.println(a);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("program start");
		NFE obj=new NFE();
		obj.numberexeption();
		System.out.println("program end");

	}

}
