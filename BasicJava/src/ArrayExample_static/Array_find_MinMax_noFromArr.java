package ArrayExample_static;

public class Array_find_MinMax_noFromArr {

	
	public static void main(String[] args) {
//write code for finding min/max no from 2D_array

		int a[][]= {{3,5,3},{7,3,9},{11,-1,2}};
		//print the 3*3 matrinx
		
		for(int i=0; i<a.length; i++) 
		{                                  //no ofrow outer loop
			
			for(int j=0;j<a[i].length;j++) 
			{     

				System.out.print(a[i][j]+"  ");

			}
			System.out.println(" ");

		}
System.out.println("**********************");

		
		int min =  a[0][0];

		for(int i=0; i<a.length; i++) 
		{                                  //no ofrow outer loop
			
			for(int j=0;j<a[i].length;j++) 
			{                               // no of coloumn inner loop
				
					if(a[i][j]<min) 
				{
						min=a[i][j];
									
				     }
			 }
	   }

		System.out.println(" "+ min);
		
System.out.println("**********************");
		
		
	/**	int j=0;
		int i = 0;
		int max = a[i][j];
		
		for(int i1=0; i1<a.length; i1++) 
		{                                  //no ofrow outer loop
			
			for(int j1=0;j1>a[i1].length;j1++) 
				
			{                               // no of coloumn inner loop
				
					if(max> a[i][j]) 
				{
						max=a[i][j];
									
				     }
			 }
	   }
		
		System.out.println(" "+ max);
		
		*
		*/
		
		
		
}
}