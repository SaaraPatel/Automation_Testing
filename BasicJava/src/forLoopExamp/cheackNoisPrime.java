package forLoopExamp;

public class cheackNoisPrime {

	public static void main(String[] args) {
	
		 int n=7 , i ; int count=0;
		 
		 		for(i=1;i<=n;i++)
		        {
		 			
		 			if(n%i==0)
			         {
		 			    count++;
					 }
		        }
		 			
		 		if(count==2) 
		 			{
		 				System.out.println("number is prime");
		 			}
		 			else {
		 				System.out.println("number is not prime");
		 			}
		        
	}
	}


