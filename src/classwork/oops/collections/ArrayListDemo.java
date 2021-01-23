package classwork.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		alist();
		algos();

	}
	
	public static void alist() {
		
		//List<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("size : " + al.size());
		System.out.println("Is empty : " + al.isEmpty());
		al.add(35);
		al.add(56);
		al.add(67);
		al.add(90);
		al.add(79);
		al.add(46);
		al.add(30);
		al.add(16);
		al.add(90);
		System.out.println("size : " + al.size());
		System.out.println("Is empty : " + al.isEmpty());
		System.out.println(al);
		al.add(1, 99);
		System.out.println(al);
		System.out.println("contains(99) :  " + al.contains(99));
		System.out.println("contains(100) :  " + al.contains(100));
		System.out.println("get at index 4 :  " + al.get(4));
		al.remove(4);
		System.out.println(al);
		System.out.println(al.toString());
		
		System.out.println("---- Priting using for loop ------------");
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + "\t");
		}
		System.out.println();
		System.out.println("---- Priting using for each loop ------------");
		for(Integer element : al) {
			System.out.print(element + "\t");
		}
		System.out.println();
		System.out.println("---- Priting using Iterator ------------");
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
		al.clear();
		System.out.println("arraylist after clear : " + al);
		
		Integer[] arr = { 35, 67, 34, 70, 80, 67, 90 };
		al.addAll(Arrays.asList(arr));
		System.out.println("after adding array elments : " + al);
	}
	
	public static void algos() {
		List<Integer> al = new ArrayList<Integer>();
		Integer[] arr = { 35, 67, 34, 70, 80, 67, 90 , 35, 90, 68};
		al.addAll(Arrays.asList(arr));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("after sorting : " + al);
		Collections.reverse(al);
		System.out.println("after reverse : " + al);
		Collections.shuffle(al);
		System.out.println("after shuffle : " + al);
		System.out.println(" max : " + Collections.max(al));
		System.out.println(" min : " + Collections.min(al));
		Collections.sort(al);
		
		List<Integer> al2 = new ArrayList<Integer>();
		Integer[] arr2 = { 35, 67, 34, 70, 80, 67, 90 , 35, 90, 68, 100};
		al2.addAll(Arrays.asList(arr2));
		Collections.sort(al2);
		System.out.println(al);
		System.out.println(al2);
		System.out.println("equals : " + al.equals(al2));
		
	}
	

}
