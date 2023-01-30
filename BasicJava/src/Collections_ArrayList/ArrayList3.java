package Collections_ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		System.out.println("****************************************");
		System.out.println("Initial list of elements: " + al);
		System.out.println("list of elements status: " + al.isEmpty());
	
// Adding elements to the end of the list
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After invoking add(E e) method: " + al);
		System.out.println("****************************************");
		
// Adding an element at the specific position
		al.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + al);
		System.out.println("****************************************");

		ArrayList al2 = new ArrayList();
		al2.add("Sonoo");
		al2.add("Hanumat");
		System.out.println("al2 ,members: "+al2);
		System.out.println("****************************************");

		
// Adding second list elements to the first list
		System.out.println("List al element before adding list al2: " + al);
		al.addAll(al2);
		System.out.println("List al element after adding list al2: " + al);
		System.out.println("****************************************");

		
		ArrayList al3 = new ArrayList();
		al3.add("John");
		al3.add("Rahul");
		System.out.println("Elements of al2: " + al2);
		System.out.println("Elements of al3: " + al3);
		System.out.println("****************************************");

		
// Adding second list elements to the first list at specific position
		al2.addAll(1, al3);
		System.out.println("After adding al3 into al2: " + al2);
		System.out.println("****************************************");

	}

}
