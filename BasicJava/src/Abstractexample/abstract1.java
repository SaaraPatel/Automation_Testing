package Abstractexample;

abstract class Demo3 {              // star with abstract key
/// in abstract class we make abst /non abst method both
	
	abstract void print();            //abstract method/incomplete method
		void display() {              // normal or non-abstract or concrete method or complete method
		System.out.println("I am a non-abstract method display()..");
	}
}

// in this only non abstrct method wriiten

abstract class Demo {       //abstract incomplete class
	void display() {       //non abstract method
		System.out.println("I am a non-abstract method display()..");
	}
	void display2() {       // non abstract method
		System.out.println("I am a non-abstract method display()..");
	}
}

// in this only abstract method written

abstract class Demo2 {        // 2nd abstract class
	abstract void print();     // abstract method 1
	abstract void print1();    // abstract method2
	abstract void print2();     //abstract method 3

}
public class abstract1 {

	public static void main(String[] args) {
		
	}
}
/*
 * class declared with Abstract keyword known as abstract class, 0 to 100% abstract
 //* it will have
 * 			- abstract method ----> method declared with abstract keyword without body
 * 			- non-abstract method --> normal method/concrete method
 * 			- constructor
 *  		- static method
 *  		- global variable
 *  Abstract class object can't be create as its incomplete class
 *  
 *  if any class contains even one abstract method dn that class should be declared as abstract class
 *  
 *  when an abstract class is getting inherited by a sub class, dn there will a contract between these classes thats
 *  subclass needs to override all the abstract method of abstract class(super class) otherwise subclass becomes
 *  abstract class
 */ 





















