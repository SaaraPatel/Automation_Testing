package StringExample;

import java.util.Scanner;

public class sample_string {
	
//creating immutable class ins string
	//1. need final variable 2. create parameterized constructor of current class 3.getter method to access
	final String  empName; 
	final int empId= 001;
	                        // 1. final variable
	final double salary;
	
//2. constructor parameterized & this keyword for final value to be change
	sample_string (String empName, double salary){
		 this.empName= empName;           //using constructor & this key we change finalvariable value
		 this.salary= salary;
		}
		
//3. create getter() for  variable accessing final value	
	 public String getempName() {
		 return empName;
	 }
	 	public double getsalary(){
	 		return salary;
	 	}
	
	
//###############################################################//	
	
	private static String[] charAt;

	public static void main(String[] args) {
		
		String s1= "I am sara";               //write string using"" literal form
        System.out.println("Print the legnth: " +s1.length());
    	System.out.println("print index value of stringn :" +s1.charAt(3));
    	System.out.println("print index value of stringn :" +s1.charAt(6));
    	System.out.println("#####################################");

   // scanning the data (read from keyboard) 	
    	
    	Scanner scn = new Scanner(System.in);
    	scn.next();
    	
    //	System.out.println(" Give the input from user side in string: "+ nextint());
    	
    	System.out.println("#####################################");

        
        char arr[]= {'J','A','V','A'};
        	System.out.println("print size of stringn :" +arr.length);
        
       // String arr1[]= new String[8];
        	for(int i= 0; i<arr.length; i++) {
        		System.out.println("Print each char using for loop:" +arr[i] );
            	}
        	System.out.println("#####################################");

        	
       // for each loop
        	for(char i : arr) {
        		System.out.println("for each loop o/p: " + i);
              	}
        	System.out.println("#####################################");

        	
        	
        String S2= "Anwar";
        String S3= "SAROWER";
        String S4= "Anwar";

        System.out.println(" S2 string: " +S2);
        System.out.println(" S2 string: " +S3);

    // in string equals it will compare based on value/data
        System.out.println("Compare S1 and S2 based on equal function: " +S2. equals (S3));
        System.out.println("Compare S1 and S2 based on equal function: " +S2. equals (S4));
    	System.out.println("#####################################");

   // in string == will compare based on there address value  
        System.out.println("Compare S1 and S2 based on (==) function: " +S2== S3);
        System.out.println("Compare S1 and S2 based on (==) function: " +S2==S4);
    	System.out.println("#####################################");

	//in string add to thing with + sign means(don't add)
    	String A = "Sara+Anwar";
    	System.out.println("Result with + sign in string: " +A);
	
    // in string concat means it will add the two things
    	System.out.println(A.concat("Aroosh"));
    	System.out.println("#####################################");

    	
   // In string we cant add string no directly net to convert in integer 
    	
    	String B = "1234";
    	 /// here in B string it wont add 100 no..so need to 
    	//need to convert string no.in to integer form
		int Add=Integer.parseInt(B);
    	int Res= Add+100;

	    System.out.println("string cant add digit:" +B);
    	System.out.println("coverting string no in to integer no: "+Res );
    	
  //4. create object for accessing final variable and change in that
    	
    	sample_string obj = new sample_string("AnwarSara", 55000);
    	System.out.println("get the immutable value for empName: "+obj.empId);  //if final value declare directly acess bu obj
    	System.out.println("get the immutable value for empName: "+obj.getempName());
    	System.out.println("get the immutable value for salary: "+obj.getsalary());
    	System.out.println("****************************************************");
    	// for updating the value we cant directly update by obj 
    //	 obj.empName= "Aroosh";  so in immutable class we cant update the same objet
    //	 obj.salary = 30000;
    //	obj.empId= 002;
    // for updation need to creat new object of current class
    	
    	sample_string obj1 = new sample_string("SARoWAR", 45000);
    	System.out.println("get the immutable value for empName: "+obj1.getempName());
    	System.out.println("get the immutable value for salary: "+obj1.getsalary());
    	System.out.println("****************************************************");
	}

	private static String nextint() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String nextString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
