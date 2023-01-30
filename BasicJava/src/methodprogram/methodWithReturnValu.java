package methodprogram;

public class methodWithReturnValu {

	public static void main(String[] args) 
	{
		
     	int A= 10; int B=20;                 //simple format
     	int res= A+B;
         System.out.println("print value of result: "+res);
         System.out.println("****************************");
	   
         System.out.println(addTwoNum(23 , 33));
         System.out.println(showalphabate('R'));     
	}
	
	                                         // with return type int

	public static int addTwoNum(int A , int B)
		{
		int result= A+B;
		System.out.println("print: "+result);
		System.out.println("*******************");
	   return result;
		}
	
	static char showalphabate(char c)  ///character display with char teturn type
	{
	    System.out.println("********************");
	 return c;
	}
	
	
	
}



