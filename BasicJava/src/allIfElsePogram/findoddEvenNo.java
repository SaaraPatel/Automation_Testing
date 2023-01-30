package allIfElsePogram;

public class findoddEvenNo {

	public static void main(String[] args)
	{
//check no is even or odd by if else condition		
	  
	
	     int i=11;                           //using basic if else
	     if (i%2==0) {
	    	 System.out.println("no is even");
	                 }
	     else {
	    	 System.out.println("no is odd");
	    	 System.out.println("************************");
	          }
	    	 
	     
	     oddEvenNum(45);
	     oddEvenNum(37);
		     
	}
	     
	
	         
	      static void oddEvenNum(int num) {            //using methodes 
	    	  
	    	 // int num=34;
	    	  if(num%2==0) {
	    		  
	    		  System.out.println("no is even");  
	    	                }
	    	  else {
	    		  System.out.println("no is odd");
	    	       }
	      }
	
	
	
}

