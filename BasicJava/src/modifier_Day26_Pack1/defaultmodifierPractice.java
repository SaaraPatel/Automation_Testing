package modifier_Day26_Pack1;



            ///class 1//
public class defaultmodifierPractice {
	
	int empid;
	double salary=45000;
    	 int getId( int empid) {
    	
    		 System.out.println("getid: "+ empid);
    		return empid;
    	 }
   
	public static void main(String[] args) {
         //class 1 object
		defaultmodifierPractice obj = new defaultmodifierPractice();
		System.out.println("get salary:" +obj.salary);
		System.out.println("get ID:" +obj.empid);
		obj.getId(01);
		obj.getId(02);
		
		// class 2 object
		
		//AcessdefaultmodifierPractice obj1 = new AcessdefaultmodifierPractice();
	      
		//System.out.println("get rollno:" +obj1.rollno);
	
	
	}
	
	}


           /// class 2///
// in default class we access two class data with in same package
           
  class AcessdefaultmodifierPractice {
	int empid;
	double salary=45000;
	
	float rollno=10.9f;            //
    	 int getId( int empid) {
    	
    		 System.out.println("getid: "+ empid);
    		return empid;
    	 }

	public static void main(String[] args) {
       
		defaultmodifierPractice obj = new defaultmodifierPractice();
		System.out.println("get salary:" +obj.salary);
		System.out.println("get ID:" +obj.empid);
		obj.getId(01);
		obj.getId(02);
		
		// class 2 object

		AcessdefaultmodifierPractice obj1 = new AcessdefaultmodifierPractice();
	      
		System.out.println("get rollno:" +obj1.rollno);
	}
	}
	
	
	
