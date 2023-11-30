package org.String_Practice;

public class Assignment_CountVowel_Consonant 
{
	public void Count() 
	{
		int vcount=0, ccount=0;
		String str="This Is A really Simple Sentance";
		str=str.toLowerCase();
		
		for (int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vcount++;
			}else if(str.charAt(i)>='a'&&str.charAt(i)<='z') 
			{
				ccount++;
			}
		}	
		System.out.println("Number of vowels:-"+vcount);
		System.out.println("Number of consonant:-"+ccount);

	}

	public static void main(String[] args) 
	{
		Assignment_CountVowel_Consonant obj=new Assignment_CountVowel_Consonant();
		obj.Count();
	}

}
//  "||" pipe mens OR