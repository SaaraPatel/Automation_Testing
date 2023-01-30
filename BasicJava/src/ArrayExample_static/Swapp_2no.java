package ArrayExample_static;

public class Swapp_2no {

	public static void main(String[] args) {
	
// swap with temp variable		
		int a= 5; 
		int b =4; 
		int temp;
		
		temp=a;       //a--temp=5
		a=b;          //b---a  =4
		b=temp;       //temp---b=5
		
		System.out.println(a); 
		System.out.println(b); 
		System.out.println("***************"); 

		
		// Swap with out variable  
		a=a+b;                      // a= 9
		b=a-b;                     //b = 5 
		a=a-b;                      // a= 4  
		System.out.println(a); 
		System.out.println(b); 

		
	}

}
