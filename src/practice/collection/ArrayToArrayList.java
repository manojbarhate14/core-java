package practice.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		int ar[]= {345,728,366,3667,237};
		List<Object>list=Arrays.asList(ar);
		list.remove(1);
		
		for(Object obj: list) {
			System.out.println(obj);
		}

	}

}
