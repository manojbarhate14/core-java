package org.condition_andLoop;

public class Numberdraw {

	public void numberpattern() {

		int i,j;
		for( i=1; i<=3; i++) 
		{
			for(j=1; j<=3; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main (String[] args) {
		Numberdraw ref=new Numberdraw();
		ref.numberpattern();

	}
}

