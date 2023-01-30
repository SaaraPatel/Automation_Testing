package whileloopprogram;

public class palindromeUsingWhile {

	public static void main(String[] args) {
		
		int num= 123 ,rev=0;
		int temp =num ; 
			
		while(temp!=0)
			{
				int rem=temp%10;       // rem=121%10=1
					rev= rev*10+rem;   // 0*10+1=1
					temp= temp/10;	   // 121/10=12
			}
		System.out.println("No is palindrome: "+ rev );
		
				if(rev==num) 
				{
					System.out.println("No is palindrome:");
				}
				else
				{
					
					System.out.println("No is not palindrome:");
				}

	}

}
