package Collection_vector;

import java.util.Vector;

public class VectorExp2 {

	public static void main(String[] args) {
		// Create a vector
		
			Vector<String> vec = new Vector<String>();
				System.out.println("Elements are: " + vec.capacity()); // 10 default
	
	// Adding elements using add() method of List
				vec.add("Tiger");
				vec.add("Lion");
				vec.add("Dog");
				vec.add("Elephant");
				vec.add("Cat");
				vec.add("Tiger");
				vec.add("Lion");
				vec.add("Dog");
				vec.add("Elephant");
				vec.add("Cat");
				vec.add("Tiger");
				vec.add("Lion");
				vec.add("Dog");
				vec.add("Elephant");
				vec.add("Cat");
				vec.add("Tiger");
				vec.add("Lion");
				vec.add("Dog");
				vec.add("Elephant");
				vec.add("Cat");
				System.out.println("Elements are: " + vec);	 //20 elements	
				vec.addElement("mat");  //21th element
				System.out.println("Elements are: " + vec.capacity());  //40 becoz every time it will double the capacity 
				System.out.println("Elements are: " + vec);  //21       // we add 20 element +add 21 so, it will double the 20 cap=40 
				for(String str: vec) {
					System.out.println(str);
	}
	}
}
