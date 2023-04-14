package practice;


public class Only_Pract {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int ar1[]= {6,7,8,9,10};
		
//		output= 11 11 11 11 11
		
		int ar2[]=new int [ar1.length];
		int ar3[]=new int [ar.length];
		
		
		
		
		for(int i=0; i<ar.length;i++) 
		{
			ar3[i]=ar2[i]+ar[i];
		}
		
		for(int i=0; i<ar3.length; i++) 
		{
			System.out.println(ar3[i]);
		}
	}
}



