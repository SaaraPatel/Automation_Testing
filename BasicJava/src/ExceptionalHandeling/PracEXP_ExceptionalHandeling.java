package ExceptionalHandeling;

import java.util.Scanner;

public class PracEXP_ExceptionalHandeling {

	public static void main(String[] args) {
		
	//write the program///
	
		int num1 = -4,num2 = -5;
		int sum= num1+num2;
		System.out.println("show the sum:" +sum);

		if(sum<0) {
			System.out.println("start prog");
			try {
			} catch (ArithmeticException E) {
				System.out.println("ArithmeticException");
				System.out.println("Add is less=to 0" );			}
			
				finally {
					System.out.println("in any condition i am execute");
				}
		   }	
			 {
				System.out.println("show the sum:" +sum);
			}
		}

		
	}

// userdefind execption//////////
    class sarasExceptions extends Exception {
	  sarasExceptions (String str){             //parameterised constructor
		  super(str);              //super statement should passed string
	  }
    }
		public class PracEXP_ExceptionalHandeling_smaple{
			
			public void getaverage(double Avg) {             //method
				
				if(Avg>=50) {
					try {
						throw new sarasExceptions("not applicable"); 
					
						} catch (Exception E) {
						E.printStackTrace();
					}
				}
					else {
						System.out.println("is applicable");
					}
				}
				
		
		
		public static void main(String[] args) {
			System.out.println("Enter the number");
			Scanner scn=new Scanner(System.in) ;
			//number scn= in.nextInt();
			
			int A=0,B=0,C=-9;
			double Avg1=(A+B+C)/3;
			System.out.println("print avg:" +Avg1);
			
				
PracEXP_ExceptionalHandeling_sample pr=  new PracEXP_ExceptionalHandeling_sample();
			pr.getaverage(49.2);
			System.out.println("avg");
			
			
}
}   
    

