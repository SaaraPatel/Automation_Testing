package variableprogram.basics;

public class LocalVariableDeclaration 
	{
	


	public static void main(String[] args) 
	{
	   //local variable declare inside main method but is not madatory to declare inside 
		
		int empId= 1001;
		double salary= 35000.50;
		
		System.out.println("Start the Program");
		
		System.out.println("empld no. ="+empId);
		System.out.println("Salary of Emp.="+salary);
	
		
		//updating empid and salary
		
		empId= 1002;
		salary= 45000.48;
		
		System.out.println("Updated EmpId="+empId);
		System.out.println("Updated Salaey of emp.="+salary);

		System.out.println("End of Program");

	}

}
