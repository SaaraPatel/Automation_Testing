package allIfElsePogram;

public class findPossitiveNegNum {

	public static void main(String[] args) 
	{
		int num1= -76;    //program of finding +ve/-ve num using if else
		
			if(num1>=0)
			{
				System.out.println("number is possitive: " +num1);
				System.out.println("*****************************");
	        }
			else
			{
				System.out.println("number is Negative: " +num1);
				System.out.println("*****************************");
			}
   
			
			findPosNegNum(45);
			findPosNegNum(-35);
			findPosNegNum(0);
}
	
	
	
	  static void findPosNegNum(int A)
	  {
		  if(A>=0)             //program of finding +ve/-ve num using Method
			  {
				System.out.println("number is possitive: " +A);
				System.out.println("*****************************");
	        }
			else
			{
				System.out.println("number is Negative: " +A);
				System.out.println("*****************************");
			}
	  }
	
	
     }