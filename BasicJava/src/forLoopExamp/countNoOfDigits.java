package forLoopExamp;

public class countNoOfDigits {

	public static void main(String[] args) {
	    int num=234; int i;
		int count=1;
		
			for(i=0;i<num; i++)
			{
				if(num%10>=0) {
				   				
					count=count+1;
					num=num/10;
				}
					
			}
					System.out.println("Total digit in nuber:" +count);
				             
			
			
	         }
		
}
