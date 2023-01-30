package forLoopExamp;

public class reverseNum {

	public static void main(String[] args) {
		
		int n=2345; int i ;
		int rev=0; 
		
			for(i=0; i<=n; i++)
				
			{
			      
			    int  rem=n%10;          //5
			    	 rev= rev*10+rem; //0*10+5= 5
			    	 n= n/10;         // 2345%10= 234
			    i=0;
			}
			     System.out.println(rev);
			     
			     
	}
}
