package constructor;

public class constructor2 {

		int roll;
		double salary;
		
	    constructor2()
		{
			this.roll=roll;
			this.salary=salary;
		}
		constructor2(double salary,int roll) 
		{
			System.out.println( salary+ ": " +roll);
		}
		
		constructor2(int roll,double salary)
		{
			System.out.println(roll+":"+salary);
		}
		
	
		constructor2(int roll)
		{
			System.out.println(+roll);

		}
				
	     void display(int roll,double salary)
		{
			System.out.println(roll+ ":" +salary);
		}
		
		
		
		public static void main(String args[])
	{
			constructor2 obj = new constructor2(343.4,34);
			constructor2 obj1 =new constructor2(12,33.2);
			System.out.println("***************");
			
			obj.display(78,786.0);
			System.out.println("***************");
			obj1.display(23, 23.33);
			
		
		
	}

}
