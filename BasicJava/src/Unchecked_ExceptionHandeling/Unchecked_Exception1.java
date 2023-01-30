package Unchecked_ExceptionHandeling;

public class Unchecked_Exception1 {

	////////	Throwing Unchecked Exception/////////
		    //function to check if person is eligible to vote or not   
		   
	public static void signalTimeout(long time) throws InterruptedException    //throws handle at method level
	{ 
		    	System.out.println("Signal started");
		        
		    	if(time>1000) {  
		              Thread.sleep(time);         // execution get sleep for certain time
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
					try {
						signalTimeout(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
		        System.out.println("rest of the code...");
	}

}
