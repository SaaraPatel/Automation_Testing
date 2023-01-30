package Collections_ArrayList;

import java.util.Arrays;

public class Find_Duplicate_NoFromArray {

	public static void main(String[] args) {

int a[] ={ 4,5,5,5,4,6,6,9,4};
//convert in acending order
        Arrays.sort(a);
		System.out.println();
         
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				
				if((a[i]==a[j]) &&(i != j)) {
					System.out.println(a[j]+ " ");

				}
			}

		}
	}

}
