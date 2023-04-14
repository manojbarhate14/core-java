package org.condition_andLoop;

public class Evenoroddnumber {
	public void even_odd() {
		
		for(int i=0; i<=10; i++)
		{
			if(i%2==0){                     // i%2 = reminder value output
				System.out.println("even number is="+i);
			}else 
			{
				System.out.println("odd number is="+i);
			}
		} System.out.println("---------------------");
	}
	public void checkevenorodd(int a,int b) {
		if(b%2==0){
			System.out.println(b+"=>This is Even number");
		}else 
		{
			System.out.println(b+"=>This is Odd number");
		}
		{
			if(a%2==0){
				System.out.println(a+"=>This is Even number");
			}else 
			{
				System.out.println(a+"=>This is Odd number");
			}
		}
	}
	public static void main(String[] args) {
		Evenoroddnumber ref=new Evenoroddnumber();
		ref.even_odd();
		ref.checkevenorodd(26,55);
	}
}
