package Unchecked_ExceptionHandeling;

public class Unchecked_Exception2 {

		// Throwing Unchecked Exception(runtime exception)
	
   		//function to check if person is eligible to vote or not   
		    public static void signalTimeout(long time) {  //no method level exception
		    	System.out.println("Signal started");
		        if(time>1000) {  
		              try {                     //exeption handle by try-catch method
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
		        }  
		        else {  
		            System.out.println("Person is eligible to vote!!");  
		        }  
		        System.out.println("Signal ends...");
		    }  
		    //main method  
		    public static void main(String args[]){  
		        //calling the function  
		    	System.out.println("I am main....");
				signalTimeout(2000);
		        System.out.println("rest of the code...");  
	}

}
