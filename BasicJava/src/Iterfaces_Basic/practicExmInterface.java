package Iterfaces_Basic;

interface vegitables {
	//in interface it only allow abstract,default method and variable(stat/non stst)
	
	void Greenleafy();    // by default it take abstract method without body
		int A=10;
		
		}
interface Nonvagetarian {
	  abstract void chicken();
	  	static double B= 20.10;
	
}

class vegetarian1 implements vegitables {
	  public void chicken() {
		  System.out.println("I am from NonVeg family");
	  }
		  
		 public void Greenleafy() {
			  System.out.println("I am from Vegitables Family");
		  }
	  }
    

public class practicExmInterface {
	public static void main(String[] args) {
		
	// making object of child class/ sub child class
		vegetarian1 veg = new vegetarian1();  //able to access all method
		
		veg.Greenleafy();
	    System.out.println("A value will be: " +vegitables.A);		
		veg.chicken();
//	System.out.println("B value will be :" + veg.B);   // cant access becoz nonveg is not parent of veg
		
		
		
	}
}