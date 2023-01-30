package Iterfaces_Basic;

//Interface
interface Animal {
	int age=20;                  //by default public static final
	public void animalSound();  // interface method (does not have a body)
	public void sleep();       // interface method (does not have a body)
}
//Pig "implements" the Animal interface
class Pig implements Animal {
	
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

public class interface4 {

	public static void main(String[] args) {

		Pig p1 = new Pig(); // Create a Pig object
		p1.animalSound();
		p1.sleep();
		System.out.println(Animal.age);
	//	Animal.age=200; 

	}

}
