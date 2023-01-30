package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayPracticeEXP {

	public static void main(String[] args) {

		ArrayList list= new ArrayList();
		
		list.add("Sara");
		list.add("Anwar");
		list.add("Sara"); 
		
		list.add("Anwar");
		list.add("Sara"); // take duplicate
		list.add(10);
		list.add(20);
		list.add(20);  
		list.add(true);
		list.add('A');
		list.add(2,"Aroosh");
		
		System.out.println(list.contains(list));
		System.out.println(list.equals("Sara"));
		System.out.println(list.get(3));
		System.out.println(list.remove(5));
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println("*********************");
		
		
// for looop for list
		System.out.println("####using simple for loop####");

		for(int i=0;i< list.size();i++)
		{
			System.out.println(list.get(i));
			
		}
		System.out.println("*********************");
		
//for each loop
		System.out.println("####using for-each method####");

		for(Object sr:list)
		{
			System.out.println(sr);
		}
//new for-each loop introduced by java8
		System.out.println("####new for-each loop by java8####");
		
		list.forEach(RR->{
			System.out.println(RR);
		});

		
//take loop with iterator
		System.out.println("####using iterator method####");

		Iterator itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	


	ArrayList<Integer> al= new ArrayList<Integer>();  //generic
	
	al.add(5);
	al.add(15);
	al.add(10);
	al.add(10);
	System.out.println(al);
	System.out.println("********");
	System.out.println(list.lastIndexOf(al));
	System.out.println("*********************");
	
	Collections.sort(al);
	System.out.println(al);
	Collections.reverse(al);
	System.out.println(al);

	al.retainAll(list);
	System.out.println(al);
	
	
	
	List lk= new LinkedList();
	
	lk.add("fff");
	lk.add("ghb");
	
	for (Object pp:lk) {
		System.out.println(pp);
	}
	
	LinkedList <Boolean> bb= new LinkedList<Boolean>();
	
	bb.add(true);
	bb.add(false);
	System.out.println(bb.size());
	//for printing for each loop
	System.out.println("*********************");

	bb.forEach(zz -> {
		
		System.out.println(zz);
	
	});
	
	
	Vector<Character> vv =new Vector<Character>();
	vv.add('a');
	vv.add('b');
	vv.add(0, 'x');
	vv.add('s');
	vv.add('a');
	vv.add('b');
	vv.add(4, 'x');
	
System.out.println("**************");
	vv.forEach(cc -> {
		
		System.out.println(cc);
	
	});
	System.out.println("**************");
	System.out.println(vv.size());

	System.out.println(vv.capacity());  //default capacity is 10 forvector after 10 it will double
	System.out.println("**************");

	vv.add('d');
	vv.add('f');
	vv.add(6, 'h');
	vv.addElement(null);
	System.out.println(vv.capacity());  //default capacity is 10 forvector after 10 it will double

	
	
	
}
}
