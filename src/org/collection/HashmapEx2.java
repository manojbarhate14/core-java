package org.collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapEx2 {
	public void keydataprint() {
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
		System.out.println("HashMap is empty or not ="+mp.isEmpty());
		
		System.out.println(mp.keySet());
		
		Set<Object> keydata = mp.keySet();
		System.out.println();
		System.out.println("By Using Foe each Loop\n");
		for(Object o:keydata) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		HashmapEx2 obj =new HashmapEx2();
		obj.keydataprint();

	}

}
