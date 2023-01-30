package Collections_ArrayList;

import java.util.ArrayList;

public class Find_the_uniqueNo_not_repeated_no_From_Arraylist {

	public static void main(String[] args) {


		int a[] ={ 4,5,5,5,4,6,6,9,4};

		// Print unique number from the list- Amazon 

		//print the string in reverse

		ArrayList<Integer>ab =new ArrayList<Integer>();

			for(int i=0;i<a.length;i++)
		{
				System.out.println(a[i]);

				int k=0;

				if(!ab.contains(a[i]))

		{

		         ab.add(a[i]);

		   k++;

		    for(int j=i+1;j<a.length;j++)

		{

			if(a[i]==a[j])

		{

		k++;

		}

		}



		if(k==1)

		System.out.println(a[i]+ " : is unique number");

		}

		}
	}

}
