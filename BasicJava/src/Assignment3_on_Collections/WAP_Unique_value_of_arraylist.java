package Assignment3_on_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class WAP_Unique_value_of_arraylist {

	public static void main(String[] args) {

         ArrayList <Integer> ar= new ArrayList<Integer>();
         ar.add(10);
         ar.add(15);
         ar.add(10);
         ar.add(5);
         ar.add(10);
         ar.add(20);
         System.out.println("print legnth of array:" + ar.size());
         
// print array need for each loop
         for( int l1:ar) {
        	 System.out.println(l1);
         }
         System.out.println("***************");
//1. sort in acending order
         Collections.sort(ar);
         System.out.println(ar);
         
  ///// read,iterate the array outer loop /////////
  /*1. 1st do list in acending, 
    2. then compare 1st no with 2nd (for loop)
    3. increment the i+1
    4. a[i]==a[i+1]===> dont print the no becoz bothe are same
    5. if a[i]!=a[i+1}===> print no becoz it is unique 
       */       
         
         for(int i=0; i<ar.size()-1;i++)
         {
        	 
        	 for(int j=i+1; j<ar.size();j++)
        	 {
              	 if((ar(i)==ar(j)) && (i!=j))
              	 {
        		System.out.println((j));
        	}
         }
	}

	}

	
	}

