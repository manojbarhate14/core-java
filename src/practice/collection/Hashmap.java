package practice.collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {


	public static void main(String[] args) {
		
		HashMap<String , Integer> map= new HashMap<>();
		
		map.put("india", 100);
		map.put("china", 200);
		map.put("US", 50);
		map.put("Indonessia", 500);
		map.put("Shrilanka", 800);
		map.put("UK", 400);
		
		for(Map.Entry<String, Integer> e: map.entrySet())
		{
			System.out.println(e.getValue());
		}
	}

}
