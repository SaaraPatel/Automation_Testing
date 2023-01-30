package Assignment3_on_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WAP_Add_Arraydlist_Into_set {

	public static void main(String[] args) {

		System.out.println("#####ArrayList");
			List<String> aList = Arrays.asList("Geeks", "for", "GeeksQuiz", "GeeksforGeeks", "GFG","for");
				System.out.println(aList);
			
		
        	Set<String> hSet = new HashSet<String>();
        	System.out.println("####In to Set");
            for (String x : aList)
            
                   hSet.add(x);

   System.out.println(":::::Created HashSet is::::::::");
   			for (String x : hSet)
   				System.out.println(x);
       	
        	
        }
	}

