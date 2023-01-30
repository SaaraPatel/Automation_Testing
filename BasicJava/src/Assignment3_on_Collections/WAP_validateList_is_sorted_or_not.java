package Assignment3_on_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WAP_validateList_is_sorted_or_not {

	public static void main(String[] args) {


		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(4);
		arr.add(44);
		arr.add(3);
		arr.add(15);
		arr.add(14);
		arr.add(19);
		
		for(int s: arr) {
			System.out.println(" " +s);
		}
		Collections.sort(arr);
	    List copy = new ArrayList(arr);
	    if(arr.equals(copy)) {
	    	System.out.println("it is sorted data"+ copy);
	    }
	    else {
	    	System.out.println("Not sorted data:" +copy);
	    }
	    System.out.println("**********");
	    System.out.println(arr);
	  
	   
		
		

		
	ArrayList<String> xx= new ArrayList<String>();
	
	xx.add("Jan");
	xx.add("Feb");
	xx.add("Mar");
	xx.add("Apr");
    xx.add("May");
	xx.add("Jun");
	
	 
	    List<String> copy1 = new ArrayList<String>(xx);
		    	
	               Collections.sort(copy1);
		    		if(copy1.equals(xx)) {
		    			
		    			System.out.println("it is sorted data"+ copy1);
		    	    }
		    	    else {
		    	    	System.out.println("Not sorted data:" +copy1);
		    			
}
	
}	

}