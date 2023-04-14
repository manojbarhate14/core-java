package org.condition_andLoop;

public class Assignment_star_down {


	public static void main(String[] args) {
		int i,j,k;
		for( i=2; i>=0; i--)
		{
			for ( j=0; j<=2-i; j++)
			{
				System.out.print("  ");
			}
			for(  k=0; k<=i ;k++)  
			{

				System.out.print(" *  ");
			}
			System.out.println();
		}
	}
}
