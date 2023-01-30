package constructor;

public class cons4 {

	int age;
	double salary;
	char c_var;
	float perf;
	
	
	 // below is default constructor, that will be written by java compiler at compile time
	  //constructor work based on parameter(type,position,variable)
	    cons4(int age)
	    	{
	    	System.out.println("constructor age:" +age);
	    	}
		cons4(int age,char c_var)
					{
			System.out.println(age+":" +c_var);
					}
		cons4(double salary, float perf)
				{
			System.out.println(salary+":" +perf);
				}
		cons4(int age,double salary)
	    {
			System.out.println(age+":" +salary);
		}
		cons4(int age,float perf)
	    {
			System.out.println(age+":" +perf);
		}
		
		
		
		void display(int age,double salary) {
	    	System.out.println(age+":" +salary);
		}
		
		void display(char c_var,double salary) {
	    	System.out.println(c_var+":" +salary);
		}

	public static void main(String[] args) {

		cons4 c1 = new cons4(12);       //calling constructor based in parameter
		cons4 c2 = new cons4(12,765.0f); //
		cons4 c3 = new cons4(10,4567.0);
		
		System.out.println(c1.age);// 0
		System.out.println(c1.salary);// 0.0
		System.out.println(c1.c_var);
		
		c1.display(12, 3780.0);             //calling non globale var by method
	    c2.display('A',45000.54);
	}
	
}     //in method calling by single ref need like c1
      //but in constructor ref value cahge with paramete1

