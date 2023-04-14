package org.condition_andLoop;

public class Number {
	public void numberloop()
	{
		int i,j;
		for( i=1; i<=3; i++) 
		{
			for(j=1; j<=3; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		Number ref=new Number();
		ref.numberloop();
	}

}
