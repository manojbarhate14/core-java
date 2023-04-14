package org.collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapEx3 {
	public void keydata() {
		HashMap<Object, Object> mp1=new HashMap<Object, Object>();
		
		mp1.put("Key1", "Goa");
		mp1.put("Key2", "Daman");
		mp1.put(null, "Ooty");
		mp1.put("Key3", "Ladakh");
		mp1.put("Key4", "Gangtok");
		mp1.put(null, "Manali");
		System.out.println(mp1);
		
		Set<Object>keydata=mp1.keySet();
		System.out.println(mp1.values());
		for(Object o: keydata) {
			if(o!=null) {
				if(o.equals("Key3")) {
					System.out.println(o);
				}
			}
		}
	}

	public static void main(String[] args) {
		HashmapEx3 obj =new HashmapEx3();
		obj.keydata();
	}

}
