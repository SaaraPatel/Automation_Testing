package variableprogram.basics;

public class NonStaticGlobleVariable {
        
	int empId=1001;             //Non static globle variable
	double salary= 45000.5;    //Non static globle variable
	// becoz it not start with static keyword so it is nonstatic
	
	
	public static void main(String[] args) {
	
// create object to access Non Static Globle Variable
		
		NonStaticGlobleVariable obj= new NonStaticGlobleVariable(); 
		
		System.out.println("Employe Id :" +obj.empId);
		System.out.println("Employe Id :" +obj.salary);
	    System.out.println("************************************8");
	    
// update the given nonstatic globle variable
		
	obj.empId= 1002;
	obj.salary= 65778;
	
	NonStaticGlobleVariable obj1= new NonStaticGlobleVariable(); 
	
	System.out.println("Employe Id :" +obj1.empId);
	System.out.println("Employe Id :" +obj1.salary);
	}

}
