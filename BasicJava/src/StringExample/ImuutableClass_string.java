package StringExample;

public class ImuutableClass_string {
		
		/*
		 * 
		 * Class and its data members should be declared as final
		 * Constructor should be parameterized, so that above data members can be initialize 
		 * Only getter() method should be written in the class for data members
		 */
		final String name;
		final double salary;
		ImuutableClass_string(String name,double salary){ //final variable can chane by using constructor using this value
			this.name=name;     //local var change in globle
			this.salary=salary;
		}
		public String getName() {         //getter method for name
			return name;
		}
		public double getSalary() {      //getter method for salary
			return salary;
		}
	}
	
        class Sample1{
			public static void main(String[] args) {
		//object for current class for accessing getter valu		
				
				ImuutableClass_string obj=new ImuutableClass_string("Pune",656535);
				
				System.out.println(obj.getName());
				System.out.println(obj.getSalary());
//              obj.name="nbjh";
//				obj.salary=356565; //but in this we cant get update value in same object
				
			//for updating value new object should creat
				ImuutableClass_string obj2=new ImuutableClass_string("Mumbai",2454);
				
				System.out.println(obj2.getName());
				System.out.println(obj2.getSalary());

	}

}
