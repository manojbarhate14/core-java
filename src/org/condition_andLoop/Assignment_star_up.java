package org.condition_andLoop;

public class Assignment_star_up {

	public static void main(String[] args) {
		
		int i,j,k;
		for( i=0; i<=10; i++)
		{
			for ( j=i; j<=9; j++)
			{
				System.out.print("  ");
			}
			for( k=0; k<=i ;k++)  
			{

				System.out.print("  * ");
			}
			System.out.println();
		}
	}
}


