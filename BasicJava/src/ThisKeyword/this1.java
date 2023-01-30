package ThisKeyword;

public class this1 {
	
//in constructor class name & parameter constructor name should same
		int a;
	    int b;     
	                                  // Parameterized constructor
	    this1(int a, int b)
	    {
	        this.a = a;
	        this.b = b;
	    } 
	    void display()
	    {
	                           //Displaying value of variables a and b
	        System.out.println("a := " + a  + "  b: = " + b);
	    } 
	    public static void main(String[] args)
	    {
	    	this1 object = new this1(10, 20);
	        object.display();
	        System.out.println(object.a+" :"+object.b);// directly display
	        
	        System.out.println("*************************");
	        
	        this1 object2 = new this1(102, 201);
	        object2.display();
	     //   System.out.println(object2.a+" :"+object2.b);//
	    }

}
