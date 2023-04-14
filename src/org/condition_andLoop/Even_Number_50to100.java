package org.condition_andLoop;

public class Even_Number_50to100 {
	// print even number from 50 to 100 without using +=2
	
	public void even(){
		
		for(int a=50;a<101;a++) {
			System.out.println("a="+a);
			a++;
		}
		
		
	}

	public static void main(String[] args) {
		
	//	for ( int a=50; a<101; a ++)
	//	if (a%2==0)
	//	{
	//		System.out.println("a="+a);
	//		a++;
		
		Even_Number_50to100 obj=new Even_Number_50to100();
		obj.even();
		

	}

}
