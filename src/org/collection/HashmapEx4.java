package org.collection;

import java.util.HashMap;

public class HashmapEx4 {
//All method in HashMap
	public static void main(String[] args) {
		HashMap<Object, Object> mp = new HashMap<Object, Object>();
		mp.put("pin code", 443102);
		mp.put("key1", "value1");
		mp.put("key2", "value2");
		mp.put("key3","value3");
		mp.put(null, "vaalue4");
		System.out.println(mp);
		
		System.out.println("map size= "+mp.size());
		System.out.println("*****************");
	//	mp.clear();
		
		System.out.println(mp.isEmpty());
		System.out.println(mp.clone());
		System.out.println("Entry set :"+mp.entrySet());
		System.out.println("key set :"+mp.keySet());
		mp.replace("key2", "value5");
		System.out.println("After replace key2 value"+mp);
		System.out.println(mp.containsKey("key3"));
		System.out.println(mp.containsValue("value3"));
	}

}
