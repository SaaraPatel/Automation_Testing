package oopsbasics;

class fruit{         //fruit class parent
	  fruit(){       // fruit constructor
		  System.out.println(" I am fruit parent class");
		  System.out.println("*************************");
	         }
	  public void fruittaste() {
		  System.out.println("I am sweet");
		  System.out.println("I am bitter");
		  System.out.println("*************************");
          }
 }	
	
class Apple extends fruit{      //apple child inherite parent property
	
	Apple(){ /// apple constructor
		System.out.println("I am apple child");
		System.out.println("*************************");
	}

	public void flower() {
		System.out.println(" I am flower");
}
    public void rose() {
    	System.out.println("I am from flower catageroy");
    	System.out.println("*************************");
    }
}   
class Mango extends Apple{         //mango is subchild of apple parent
	Mango(){   //defauld super() jVM compile and they call immediate parent of apple which is fruit
		System.out.println(" I am Mango");
	}
public void fruitcolor() {
	System.out.println(" I am yello in colour");
	System.out.println("*************************");
}
	
}

///main class created with main method
public class subclassparentclass {

	public static void main(String[] args) {

		///creating object of mostchild mangoes object so he can access all class
	Mango m1= new Mango();
	
	m1.fruittaste();     // can access fruit class with inside method
	m1.flower();
	m1.rose();
	m1.fruitcolor();
		
// create Apple as object so it will access only apple and fruit class
	
	Apple a1=new Apple();
	
	a1.fruittaste();
	a1.flower();
	a1.rose();
// a1.fruitcolor();    //cant access mango method becoz it is not parent
	
	
	
	}

}
