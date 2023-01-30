package Abstractexample;

abstract class Bike1 {          ///abstract class1
	
	abstract void run();            //abstract method, no body
    static int fule=48;          // static variable
		
    void cycle(int A) {
			System.out.println("No of tyre:" +A);
		}
	
		void speed(int spd) {       //non abstract method with parameter
		System.out.println("Bike speed: "+spd);    
	}
}

class Honda4 extends Bike1 {     //  is-A rel between child cls honda
	      Honda4(){
          super.cycle(2);
 
	      
	      }        
	                       //when child class inherite abstract class that itme
 
	                       //subclass have to provide all method from parent class
	void run() {           //providing parent class method
		System.out.println("running safely");
	}
	void speed(int spd) {   //overriding parent class method by same name by subclss
		System.out.println("Honda4 speed: "+spd);
		super.speed(120);        //
	}
	void color() {            // honda childclass method
		System.out.println("Honda1 color is blue");
	}
}

public class abstract2 {

	public static void main(String[] args) {

		Honda4 obj = new Honda4();       //child class object
		
		System.out.println("fule indicator:" +Bike1.fule);
		obj.run();
		obj.speed(60);
		obj.color();
		//Bike1(34);
		
		

	}
}




















