package ArrayExample_static;

import java.util.Arrays;

public class array_copy_exp {
	public static void main(String[] args) {
		
		int[] num = {11,12,13,14,15,16};
	System.out.println("find the array lenght:)" + num.length);
	
//for each loop for print value
	for(int a: num) {
		System.out.println("Print the num value:" +a);
	}

// find the min. no from array need for loop
		int num1 []= {22,11,21,31,41}; 
		int min = num1[0] ;
		for(int i= 1; i< num1.length; i++) {
		if(min > num1[i]) {
			min= num1[i];
		}
	}
			System.out.println(" min no is :" + min);

// we get direct min no by inbuilt sort function
			Arrays.sort(num1);
				for(int a : num1) {
					System.out.println(" get assencding order: " +a);
				}
			
// find the max. no from array need for loop
				
				int max = num1[0] ;
				for(int i= 1; i< num1.length; i++) {
				if(max < num1[i]) {
					max= num1[i];
				}
			}
					System.out.println(" max no is :" + max);			
				
	int copyArray[]= Arrays.copyOf(num1, 8);
		for(int a:copyArray) {
		System.out.println(" copy array up to 8th index:" +a);
	}

	int copyofrange[]= Arrays.copyOfRange(num1, 2, 7);
		for(int a: copyofrange) {	
		System.out.println("Copy the data with in range: " + a);
		}
}
}