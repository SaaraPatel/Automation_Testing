package forLoopExamp;

public class negativeNoFactor {

	public static void main(String[] args) {
		int i; int n= -2; int count=0;
		for(i=-1;i>=n;i--)
		{
			///System.out.println(i);
			if(n%i==0)
			{
				System.out.println("factor of negative no :" +i);
				count++;
			}	
			else
			{
				//System.out.println("no factor");
			}
         }

	}

}
