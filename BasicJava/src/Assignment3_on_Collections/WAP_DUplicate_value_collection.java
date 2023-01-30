package Assignment3_on_Collections;

import java.util.HashSet;
import java.util.Set;

public class WAP_DUplicate_value_collection {

	public static void main(String[] args) {

//using set method,becoz in it it cant store duplicate value
		
		int arr[]= {1,2,4,3,1,2,5,4,6,5};
		
		System.out.println("To find string data unique no using hashset");

		Set<Integer> S= new HashSet<Integer>();
		
	// for iterationg loop use for each loop
			for(int no: arr) {
				//System.out.println(DU);
				
				boolean B =S.add(no);   //give true/false if iterator value Du is available in S oject then it give true
					
				if(B==false) {             // if t==f==> it wont print, if t==t--> print no
						System.out.println(no+ " ");

					}
			}
			
			
		System.out.println("************");	
			System.out.println("To find string data unique letter using hashset");
			Set<String> st= new HashSet<String> ();
			
			st.add("java");
			st.add("VB");
			st.add("Csharp");
			st.add("python");
			st.add("java");
			st.add("VB");
			
	//to iterate string for each loop
				
			for(String uu:st) {
				
				boolean bb=st.add(uu);
					if(bb==false) {
						System.out.println(uu);
				
			}
			
	}
}

}