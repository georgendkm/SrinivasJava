package classwork.oops.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import classwork.oops.Dog;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		System.out.println("Size : " + hm.size());
		System.out.println("Is empty : " + hm.isEmpty());
		hm.put(7, "Andrea");
		hm.put(1, "John");
		hm.put(2, "Steve");
		hm.put(3, "Linda");
		hm.put(4, "Baker");
		hm.put(5, "Sara");
		hm.put(6, "Craig");
		hm.put(7, "Michelle");

		System.out.println("Size : " + hm.size());
		System.out.println("Is empty : " + hm.isEmpty());
		System.out.println(hm);
		
		System.out.println("contains value : " + hm.containsValue("Sara"));
		System.out.println("contains value : " + hm.containsValue("sara"));
		System.out.println("contains key : " + hm.containsKey(7));
		System.out.println("contains key : " + hm.containsValue(0));
		
		hm.replace(6, "Bill");
		System.out.println("after replace : " + hm);
		System.out.println("replace status : " + hm.replace(6, "Craig", "Bill"));
		System.out.println("after replace : " + hm);
		System.out.println("replace status : " + hm.replace(6, "Bill", "Gates"));
		System.out.println("after replace : " + hm);
		
		hm.remove(7);
		System.out.println("after remove key 7 : " + hm);
		System.out.println("delete status : " + hm.remove(6, "Craig"));
		System.out.println("after delete : " + hm);
		System.out.println("delete status : " + hm.remove(6, "Gates"));
		System.out.println("after delete : " + hm);
		
		//hm.clear();
		
		System.out.println("Get a value by key : " + hm.get(5));
		
		hm.put(6, "Sara");
		
		Set<Integer> keys = hm.keySet();
		System.out.println("Keys set : " + keys);
		
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer k = it.next();
			String v = hm.get(k);
			System.out.println("Key : "+ k + " Value : " + v);
		}
		
		Collection<String> vals = hm.values();
		System.out.println("values collection : " + vals);
		
	}

}
