package modifier_Day26_Pack1;

public class ExmOfPrivateClassAccess {
           //private class 1//
	// can write only private variable,method
	
	   private int empId(int A) {   //create method for empid variation
		  
		  return A;
	   }
	   
	   private int rollno=01;   // non static var with var value	
	   private double salary;
	   
//creating constructor for rollno and salary
	   ExmOfPrivateClassAccess(int rollno)  //private class name with panramerer
	   { 
			 System.out.println(" display rollno: "+rollno);  
	   } 
	    
	   ExmOfPrivateClassAccess(double salary)	{ 
			  System.out.println("display salary:"+salary);
	   }
	
	public static void main(String[] args) {
		
		ExmOfPrivateClassAccess obj = new ExmOfPrivateClassAccess(232);
		
            System.out.println("show value: " + obj.empId(112));
            System.out.println("show value: " + obj.empId(113));
            System.out.println("*************************");
            System.out.println("show roll: "+ obj.rollno);
            System.out.println("*************************");

            ExmOfPrivateClassAccess obj1 =new  ExmOfPrivateClassAccess(02);
            ExmOfPrivateClassAccess obj2 =new  ExmOfPrivateClassAccess(40000.37);
            System.out.println("*************************");
            ExmOfPrivateClassAccess obj3 =new  ExmOfPrivateClassAccess(03);
            ExmOfPrivateClassAccess obj4 =new  ExmOfPrivateClassAccess(30000.50);
         
            
   	}  

   	}    
            
      // 2nd class in same packag        
     class priavteaccess2 {
    		public static void main(String[] args) {

 		ExmOfPrivateClassAccess obj = new ExmOfPrivateClassAccess(232);
        System.out.println("show value: " + obj.empId(114));

  /**by creating 2nd class with new main method in this class 1st class 
        data is not visible 
        becoz, private method can access private member 
        in that class only 
        
        **/
            }
     }

