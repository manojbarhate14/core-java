package org.collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx1 {
	public void mapmethod() {
		Map<Object, Object> mp = new HashMap<Object, Object>();
		mp.put(1, "Manoj");
		mp.put(2, "Ajay");
		mp.put("pin code", 443102);
		mp.put("key1", "value1");
		mp.put("key2", "value2");
		mp.put("key3","value3");
		mp.put("key3","value3");
		mp.put(null, "vaalue4");
		mp.put(null, "value4");
		System.out.println(mp);
		System.out.println("map size= "+mp.size());
		Object obj=mp.get(2);// it call key number
		System.out.println(obj);
		System.out.println("pin code= "+mp.get("pin code"));
		
		
	}

	public static void main(String[] args) {
		HashmapEx1 obj=new HashmapEx1();
		obj.mapmethod();
	
	}

}


//In map null value is allowed
//duplicate value are not allowed it will override the value
