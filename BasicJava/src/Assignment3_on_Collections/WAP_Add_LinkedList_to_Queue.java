package Assignment3_on_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WAP_Add_LinkedList_to_Queue {

	public static void main(String[] args) {


		List lt= new ArrayList();
		
			System.out.println("########Arrayliat");
			lt.add("java");
			lt.add("python");
			lt.add(29);
			lt.add(18);
			lt.add(18);
			lt.add(0);
		
		System.out.println(lt);
		System.out.println();
		
		System.out.println("######Converted linklist into Queue");
			Queue Q= new LinkedList();
				Q.addAll(lt);
		
		for(Object obj:lt) {
			System.out.println(obj);

		}
	
	}

}
