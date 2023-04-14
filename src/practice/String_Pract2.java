package practice;

public class String_Pract2 {
	
	public void atoz() 
	{
		int count=0, ocount=0;
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		str=str.toLowerCase();	
		
		for(int i=0; i<=str.length(); i++)
		{
			if(str.charAt(i)=='m'||str.charAt(i)=='s')
			{
				count++;
			}else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				ocount++;
			}
		}
		System.out.println("your count is "+count);
		System.out.println(ocount);
	}
	
	public static void main(String[]arg) 
	{
		System.out.println("start");
		String_Pract2 obj =new String_Pract2();
		obj.atoz();
		
	}
}
