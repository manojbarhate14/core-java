package practice;

public class Trial {
	public void Count() 
	{
		int vcount=0, ccount=0;
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		str=str.toLowerCase();
		
		for (int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)=='m'||str.charAt(i)=='s')
			{
				vcount++;
			}else if(str.charAt(i)>='a'&&str.charAt(i)<='z') 
			{
				ccount++;
			}
		}	
		System.out.println("Number of m&s:-"+vcount);
		System.out.println("Number of other:-"+ccount);

	}
	public static void main(String[]arg) {
		Trial obj =new Trial();
		obj.Count();
	}

}
