package Collections_ArrayList;

import java.util.ArrayList;

public class Find_frequency_ofNum_ArrayList {

	public static void main(String[] args) {
//find frquency(repating num) in the given array

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 }; // array

		// Print unique number from the list- Amazon

		// print the string in reverse

		ArrayList<Integer> ab = new ArrayList<Integer>(); // generic<int> allow

		for (int i = 0; i < a.length; i++) // outerloop runup to array.length
		// eg. take 1st no= 4;
		{

			int k = 0; // k=1 //it is use to reset the value after counting repeat no.

			if (!ab.contains(a[i])) // contains show the array data,if it contai repeat data
			// it show true but,!(NOT)convert in false and store in array
			{ // 4 contain in array so it show true but due to ! it will show false
				// and enter 4 no in arrylist cointainer

				ab.add(a[i]); // array data addd in arraylist container ab=4

				k++; // increment the temp value. for next value it will again k=0 reset
						// k=2

				for (int j = i + 1; j < a.length; j++) // looping to next value of a[i]
														// j=i+1== show 5 no
				{

					if (a[i] == a[j]) // {a[i]=4} == {a[j]=5}

					{

						k++; // k=3

					}

				}

				System.out.println(a[i]); // 4

				System.out.println(k); // 3

				// if(k==1)

				// System.out.println(a[i]+"is unique number");

			}

		}
	}

}
