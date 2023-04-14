package interviewQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatWordRemove {

	public static void main(String[] args) 
	{
		String str= "I am manoj manoj manoj";
		 
		String word[]=str.split(" ");
		
		Set<String> set= new LinkedHashSet<String>();
		
		for(String s :word)
		{
			set.add(s);
			
		}
		Iterator itr= set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
}


