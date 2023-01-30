package Collection_vector;

import java.util.Vector;

public class VectorExp1 {

	public static void main(String[] args) {

		// Create a vector
		Vector<String> vec = new Vector<String>();//default capacity is 10, its capacity gets increase by 100% of its size
						
// Adding elements using add() method of List
				vec.add("Tiger");
				vec.add("Lion");
				vec.add("Dog");
				vec.add("Elephant");
				vec.add("Tiger2");
				vec.add("Lion2");
				vec.add("Dog2");
				System.out.println("Vector Elements are: "+vec);  //7
				System.out.println("Vector capacity is: "+vec.capacity()); //10
				
// Adding elements using addElement() method of Vector
			vec.addElement("Rat");
				System.out.println("After 1st addElement, Vector Elements are: "+vec);//8
				System.out.println("After 1st addElement, Vector capacity is: "+vec.capacity()); //10
			vec.addElement("Cat");
				System.out.println("After 2nd addElement, Vector Elements are: "+vec); //9
				System.out.println("After 2nd addElement, Vector capacity is: "+vec.capacity());  //10
			for(String str: vec) {
					System.out.println(str);
				}
				
				vec.addElement("Cat100"); //10
				vec.addElement("Cat200");  //11
				System.out.println("After 2nd addElement, Vector Elements are: "+vec);  //10,11
				System.out.println("After 2nd addElement, Vector capacity is: "+vec.capacity());  //20 it will increase capacity after 10
	}

}
