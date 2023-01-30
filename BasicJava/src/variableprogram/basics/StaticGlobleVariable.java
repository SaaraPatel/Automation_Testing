package variableprogram.basics;

public class StaticGlobleVariable {
	
	
	    static int empId= 1001;
		static double salary= 54000.43;
	   // static char name= 'sara';
		

	public static void main(String[] args) {
	 
// Direct static globle variable calling method
		
		System.out.println("Start the Program");
		System.out.println("Emp Id No.="+empId);
        System.out.println("Emp Salary="+salary);
       System.out.println("*************************************************");
        
 // We can call static globle variable class filename also
        System.out.println("Start the Program");
		System.out.println("Emp Id No.="+StaticGlobleVariable.empId);
        System.out.println("Emp Salary="+StaticGlobleVariable.salary); 
        System.out.println("*************************************************");
         
 //#############################################################################       
 // Will update the empid and salary value and call
        
        empId= 2001;
        salary= 56000;
  // updated value with direct call method      
            System.out.println("Start the Program");
		    System.out.println("Emp Id No.="+empId);
            System.out.println("Emp Salary="+salary);
            System.out.println("*************************************************");
        
  // Updated value with class filename call
            System.out.println("Start the Program");
    		System.out.println("Emp Id No.="+StaticGlobleVariable.empId);
            System.out.println("Emp Salary="+StaticGlobleVariable.salary);
            System.out.println("*************************************************");
            
	}

}
