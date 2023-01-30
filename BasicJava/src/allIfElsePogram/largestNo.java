package allIfElsePogram;

public class largestNo {

	public static void main(String[] args) {     
		                                                 //logic
		                                          // num1 : num2 :num3
		                                //compare (num1-num2) && (num1-num3)
		                                //compare (num2-num1)&&(num2-num3)       
          int num1= 12;                 //compare (num3-num1)&& (num3-num2)
          int num2= 13;
          int num3=14;
          
          if((num1>num2) && (num1>num3))
          {
        	  System.out.println("Largest No is :" +num1);
        	  System.out.println("************************");
          }
          
          	if((num2>num3)&&(num2>num1))
          	{
          		System.out.println("Largest No is :" +num2);
          		System.out.println("************************");
          	}
          		if((num3>num1)&&(num3>num2))
          		{
          			System.out.println("Largest No is :" +num3);
          			System.out.println("************************");
          		}
	            
          		findLargestNum(2 ,4 ,5);
          		findLargestNum(2,7 ,4 );
          		findLargestNum(45, 34,35);
        

	}
	// find largest no using methods
	       static void findLargestNum(int A, int B, int C) 
	       {
//	    	   int num1= 34; int num2= 45; int num3= 55;
	    	   
	    	   if((A>B) && (A>C))
	           {
	         	  System.out.println("Largest No is :" +A);
	         	  System.out.println("************************");
	           }
	           
	           	if((B>C)&&(B>A))
	           	{
	           		System.out.println("Largest No is :" +B);
	           		System.out.println("************************");
	           	}
	           		if((C>A)&&(C>B))
	           		{
	           			System.out.println("Largest No is :" +C);
	           			System.out.println("************************");
	           		}
	           		
	       }	
	    	   
	       
           }
