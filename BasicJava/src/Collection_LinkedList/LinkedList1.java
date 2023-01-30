package Collection_LinkedList;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	private static AbstractSequentialList<String> l13;
	private static AbstractSequentialList<String> l1;

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>(); //generic: collect string type data only
		System.out.println("Initial list of elements: " + ll);  //empty
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("After invoking add(E e) method: " + ll);
		

// Adding an element at the specific position
		ll.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + ll);
		
// Adding first list elements to the first list
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Sonoo");
		ll2.add("Hanumat");
		
// Adding second list elements to the first list
		ll.addAll(ll2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + ll);

// Adding thired list elements to the first list
        LinkedList<String> ll3 = new LinkedList<String>();
		ll3.add("John");
		ll3.add("Rahul");
		
// Adding second list elements to the first list at specific position
		ll.addAll(1, ll3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + ll);
		
// Adding an element at the first position
		ll.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e) method: " + ll);
		
// Adding an element at the last position
		ll.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: " + ll);
		for(int i=0;i<ll.size();i++) {
			if(ll.get(i).equals("Gaurav")) {
				ll.set(i, "Bhushan");
				break;
			}
		}
		System.out.println("After invoking addLast(E e) method: " + ll);
		   System.out.println("******************************");

			

	}

}
