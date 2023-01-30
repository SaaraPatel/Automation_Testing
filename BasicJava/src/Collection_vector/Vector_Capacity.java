package Collection_vector;

import java.util.Vector;

public class Vector_Capacity {
	public static void main(String[] args) {
		
	Vector<String> vcTr = new Vector<String>();
		System.out.println("Default,Vector Capacity: " + vcTr.capacity());//default capacity is 10
		System.out.println("Vector Size: " + vcTr.size());//0
		vcTr.setSize(2);// 
		System.out.println("Vector Size: " + vcTr.size());//
		System.out.println("Vector elements: "+vcTr);//null,null
		vcTr.addElement("Sunday");
		vcTr.addElement("Monday");
		System.out.println("after addition, Vector elements: "+vcTr);//null,null,sunday,monday
		System.out.println("after add, Vector Size: " + vcTr.size());//4
		vcTr.addElement("Wednesday");
		System.out.println("After addElement, Vector Size: " + vcTr.size());//5
		System.out.println("Vector Capacity: " + vcTr.capacity());//10 default
	}

}
