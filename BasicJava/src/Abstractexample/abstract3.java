package Abstractexample;


abstract class Shape {              //abstract class 
	abstract void draw();          //abstract method
}
// In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {      // rectangle inherite shape
	protected void draw() {         //shape method provided by child class
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape {          //circle child class inherite shape subclass
	public void draw() {               // subclass,parent class method providing
		System.out.println("drawing circle");
	}
}
// In real scenario, method is called by programmer or user
public class abstract3 {

	public static void main(String[] args) {
		
		Shape s = new Circle1();
		s.draw();	
		Shape s1 = new Rectangle();
		s1.draw();
	}
}



















