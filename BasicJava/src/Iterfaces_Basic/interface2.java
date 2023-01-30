package Iterfaces_Basic;


interface i1{
	//in iterface it only all veriable and  abstract method
	//1.variable ---> by default ----> public static final
	//2.method ---> by default ----> public abstract
	//no complete methods/non-abstract
	//no constructor
}
//Interface declaration: by first user  
interface Drawable {
	int salary=25000;//by default---> public static final int salary=25000;
	void draw();//by default---->public abstract void draw();
}
// Implementation: by second user
class Rectangle1 implements Drawable {
	public void draw() {   // childclass should provide parent class all methods
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable {
	public void draw() {     // childclass should provide parent class all methods
		System.out.println("drawing circle");
	}
}
// Using interface: by third user
public class interface2 {

	public static void main(String[] args) {
		System.out.println("Interface variable salary: "+Drawable.salary); // variable can assess with interface name i.e class name
		
		Rectangle1 r1=new Rectangle1();  //object of rectangle
		r1.draw();//drawing rectangle
		
		Circle c1=new Circle();         //object of circle
		c1.draw();//drawing circle
		
		// In real scenario, object is provided by method e.g. getDrawable()
		Drawable d = new Circle();
		d.draw();//drawing circle
	}
}

/*
 * Interface--> used to achieve abstraction in java
 * 			--> as we know java doesn't support mutliple inheritance using classes to overcome this 
 * 				java provides interface to support this 
 * 			--> its 100% abstract, no non-abstract method
 * 			--> inside interface will have-(no constractor)
 * 					- variable ---> by default--->public static final
 * 					- methods  ---> by default--->public abstract
 * 			--> wheneven a sub class inherits the interface they use implements keyword
 * 				class childclass implements interfacename{
 * 
 * 				}
 * 			--> As we are not allowed to create an instance of abstract class simillarly we are not allowed to create
 * 				instance of interface(because its also incomplete)
 * 			--> when a interface is getting inherited by a sub class, dn there will a contract between these classes thats
 *  			subclass needs to override all the abstract method of interface otherwise subclass becomes abstract class
 * 			--> between 
 * 					1. two classes we use 'extends'
 * 					2. two interface we use 'extends' 
 * 					3. class and interface use 'implements' 
 */


