package classwork.oops.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import classwork.oops.Dog;

public class HashSetDemo {

	public static void main(String[] args) {
		setDemo();

	}
	
	public static void setDemo() {
		
		Set<String> hs = new HashSet<String>();
				
		hs.add("john");
		hs.add("sara");
		hs.add("linda");
		hs.add("linda1");
		hs.add("Steve");
		hs.add("Bill");
		hs.add("Bill1");
		hs.add("Baker");
		hs.add("cathy");
		hs.add("cathy");
		
		System.out.println(hs);
		System.out.println("size : " + hs.size());
		System.out.println("Is empty : " + hs.isEmpty());
		System.out.println("contains : " + hs.contains("Baker"));
		System.out.println("contains : " + hs.contains("baker"));
		System.out.println("remove : " + hs.remove("Baker"));
		System.out.println(hs);
		System.out.println(hs.hashCode());
		
		System.out.println("max : "  + Collections.max(hs));
		System.out.println("min : " + Collections.min(hs));
		
		System.out.println();
		System.out.println("---- Priting using for each loop ------------");
		for(String element : hs) {
			System.out.print(element + "\t");
		}
		System.out.println();
		System.out.println("---- Priting using Iterator ------------");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
		
		hs.clear();	
		System.out.println(hs);
	}

}
