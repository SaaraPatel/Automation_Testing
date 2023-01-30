package constructor;

public class cons3
{

		int roll;                     //non static
		double salary;
      
		cons3(int r, double s)          // position of parameter
		{
			roll=r;
			salary=s;
		}
		
		cons3(double s, int r)            //position of arg
		{
			roll=r;
			salary=s;
		}
		
		
		void display() 
		{                                         //method
			System.out.println(roll + " :" + salary);
			System.out.println("************************");
			//System.out.println(salary + " :" + roll);
		}

	public static void main(String args[]) 
	{
			cons3 c1 = new cons3(23,677.9);
			cons3 c2 = new cons3(67.9,33);
			
			c1.display();               //calling
			c2.display();
	}

}
