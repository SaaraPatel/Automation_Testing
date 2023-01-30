package MethodForNonStaticVar;

public class Nonstaticvariable {
	
	int empId=1111;
	double salary=20000;
	char ch= 'A';
	
	
	int id=1002;
	double wages=23744.4;
	
	
	
      
	void getdisplydetail(int id) 
       {
	  System.out.println("calling:" +id);
	  id=5698;
	  System.out.println(id);
       }
	
	void getdisplay1(int empId,double salary)
	{
		System.out.println(+empId);
		System.out.println(+salary);
	}
		
	
	public static void main(String[] args) {
		
		
		
		Nonstaticvariable obj= new Nonstaticvariable();
		Nonstaticvariable obj1= new Nonstaticvariable();

		System.out.println("printID: " +obj.empId);
		System.out.println("print salary: "+obj.salary);
		System.out.println("print char: " +'A');
		System.out.println("********************");
		int empId=1231;
		System.out.println(+empId);
		
		System.out.println("Id:" +obj1.id);
		System.out.println("wages:" +obj1.wages);
		System.out.println("********************");
		
		
		obj1.getdisplydetail(6788);
		obj1.id=3738;
		System.out.println(+obj1.id);
		System.out.println("********************");
		obj.getdisplay1(233, 333.89);
		
	}
			
			
	}
							
				
			

	


