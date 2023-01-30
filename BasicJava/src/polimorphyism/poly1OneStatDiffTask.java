package polimorphyism;


	
	class Animal {           //one method perform in diffrent class
		void eat() {
			System.out.println("Animals Eat");
		}
	}
	class herbivores extends Animal {   //animal class inhetare by herbivores
		void eat() {                    //override method
			System.out.println("Herbivores Eat Plants");
		}
	}
	class omnivores extends Animal {     //animal class inherate by omni
		void eat() {                     //overrride method
			System.out.println("Omnivores Eat Plants and meat");
		}
	}
	class carnivores extends Animal {
		void eat() {
			System.out.println("Carnivores Eat meat");
		}
	}
	public class poly1OneStatDiffTask {
		
		public static void main(String args[]) {
			Animal A = new Animal();
			A.eat();// Animals Eat
			Animal h = new herbivores(); // 
			h.eat();// 
			Animal o = new omnivores(); // 
			o.eat();// 
			Animal c = new carnivores(); // 
			c.eat();//
		}
	}

	/**
	 * When a method gets to know its implementation at the time of execution/rum time is known as run
	 * time poly this can be achieved by using method overriding
	 * 1. Inheritance
	 * 2. Upcasting
	 * 3. Method Overriding
	 */

	
