package whileloopprogram;

public class reverseNoWhileloop {

	public static void main(String[] args) {
		int num=2345 , rev=0;
		
		while(num!=0) 
		{
			 int rem=num%10; //rem=5
			 rev=rev*10+rem;  // 0*10+5=5
			 num=num/10;     //2345/10=234
							 
		 }
			System.out.println("reverse no is:" +rev);
	}

}
