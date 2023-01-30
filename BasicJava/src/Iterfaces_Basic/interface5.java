package Iterfaces_Basic;

//Interface 1
interface Animal1 {
	int age=20;                 //by default public static final
	public void animalSound(); // interface method (does not have a body)
	public void sleep();      // interface method (does not have a body)
}
//Interface 2
interface Reptile {
	public void color();   // interface method (does not have a body)
}
//Interface 3
interface Reptile1 {
	public void color1();  // interface method (does not have a body)
}
//Pig "implements" the Animal interface

class cat implements Animal1 {
	
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}
class Dog extends cat implements Reptile,Reptile1 {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bhow bhow");
	}
	public void color() {
		System.out.println("Color: blue");
	}
	public void color1() {
		System.out.println("Color: black");
	}
}
public class interface5 {

	public static void main(String[] args) {
		
		cat p1=new cat();
		p1.animalSound();
		p1.sleep();
		
		Dog d1=new Dog();
		d1.animalSound();
		d1.sleep();
		d1.color();
		d1.color1();
System.out.println("age:" +Animal1.age);
}

}
