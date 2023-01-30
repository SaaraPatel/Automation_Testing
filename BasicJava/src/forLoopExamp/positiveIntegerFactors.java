package forLoopExamp;

public class positiveIntegerFactors {

	public static void main(String[] args) {
		
		int i; int n=8; int count=0;
			for(i=1;i<=n;i++)
			{
				///System.out.println(i);
				if(n%i==0)
				{
					System.out.println("factor of possitive no :" +i);
					count++;
				}	
				else
				{
					//System.out.println("no factor");
				}
	         }
}
}		
 