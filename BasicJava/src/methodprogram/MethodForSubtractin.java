package methodprogram;

public class MethodForSubtractin {

	public static void main(String[] args) {
		 
		subTwoNum();
		subTwoNum(12, 34);
		addTwoNum();
		addTwoNum(5, 8);
		
	}
//// Subtracting no in this void return type without declaring parameter in arg.
	
	static void subTwoNum()
		{
		 int A=45; int B=34;
		 int res= A-B;
		 System.out.println("print value A:"+A);
		 System.out.println("print value B:"+B);
		 System.out.println("print value res:"+res);
		 System.out.println("***************************");
		} 
		
//// Subtraction in this void return type with declaring parameter in arg.  	
	 public static void subTwoNum(int A , int B){
		 int res =A-B;
		 
		 System.out.println("print value A:"+A);
		 System.out.println("print value B:"+B);
		 System.out.println("print value res:"+res);
		 System.out.println("***************************");
	   }
	 
	 
//// addition in this void return type with declaring parameter in arg. 
	 public static void addTwoNum(int A , int B){
		 int res =A+B;
		 
		 System.out.println("print value A:"+A);
		 System.out.println("print value B:"+B);
		 System.out.println("print value res:"+res);
		 System.out.println("***************************");
	   }
		
//// addition in this void return type without declaring parameter in arg. 	 
	 static void addTwoNum(){
	 int A=45; int B=34;
	 int res= A-B;
	 System.out.println("print value A:"+A);
	 System.out.println("print value B:"+B);
	 System.out.println("print value res:"+res);
	 System.out.println("***************************");
	} 

}	


