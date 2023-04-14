package practice;

public class Trial2 {
	public void atoz() 
	{
		int count=0, ocount=0;
		String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		str1=str1.toLowerCase();	
		
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i)=='m'||str1.charAt(i)=='s')
			{
				count++;
			}else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z')
			{
				ocount++;
			}
		}
		System.out.println("your count is "+count);
		System.out.println(ocount);
	}
	public static void main(String[] args) {
		Trial2 obj=new Trial2();
		obj.atoz();

	}

}
