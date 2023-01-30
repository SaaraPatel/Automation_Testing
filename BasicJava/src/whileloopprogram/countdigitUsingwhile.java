package whileloopprogram;

public class countdigitUsingwhile {

	public static void main(String[] args) {
		
		
		int num=12345,count=0;
		
		while(num!=0)
		{
			if(num%10>=0) 
			{
			                 //num=num%10;   //123%10= 3 greater than 0
			count=count+1;   //0+1=1
			num=num/10;     // 123/10=12
		    }
		 	
		   }
		System.out.println("total count:"+ count);
	}

}