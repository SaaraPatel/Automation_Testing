package ArrayExample_static;

class DemoArray {    
	int age;
	DemoArray(){         //constructor 1
		System.out.println("Zero-Param");
	}
	DemoArray(int age){     //constructor 2
		System.out.println("Int-Param");
		this.age=age;
	}
	void display() {       // method
		System.out.println("I am display method");
		System.out.println("Age value is : "+age);
	}
}
public class array5            {
	public static void main(String args[]) {
		
//		DemoArray d1=new DemoArray();
//		d1.display();
//		DemoArray d2=new DemoArray(25);
//		d2.display();
		
		//Array of non-primitive type/array of class type
		DemoArray getDemoArray[]=new DemoArray[2];
		getDemoArray[0]=new DemoArray();
		getDemoArray[1]=new DemoArray(25);
		
		getDemoArray[0].display();
		getDemoArray[1].display();
	}
}	



