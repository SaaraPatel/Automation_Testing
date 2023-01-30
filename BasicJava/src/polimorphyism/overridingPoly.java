package polimorphyism;


//overriding in polymorphy is done in IS-A rel/Inheritance
//for this NonStatic GV is need and subclass inherate superclass
//for overriding subclass should carri same method of super class

class Vehicle {
	                // defining a method
	void run() {
		System.out.println("Vehicle is moving");
	}
}
// Creating a child class
class Car2 extends Vehicle {
	              // defining the same method as in the parent class
	void run() {
		System.out.println("car is running safely");
	}
}
public class overridingPoly {
	public static void main(String[] args) {

		Car2 obj = new Car2();// creating object
		obj.run();// 
	}
}
