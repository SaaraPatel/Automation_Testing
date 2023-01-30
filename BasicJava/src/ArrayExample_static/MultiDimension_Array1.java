package ArrayExample_static;

public class MultiDimension_Array1 {
	public static void main(String args[]) {
		
		/////////// method 1 declaring and initializing 2D array////////////////
		
		int[][] a = new int[3][4];                          // 3 row and 3 column
		System.out.println("Array Size: " + a.length);     //number of rows in array
		for (int i = 0; i < a.length; i++) {               // row count
			for (int j = 0; j < a[i].length; j++) {// cell count on current row
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
///////////////////// method 2 declaration & initialization of 2D array/////////////////		
		System.out.println("*****************************");
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		
		////////////////// printing 2D array  //////////////////
		for (int i = 0; i < a.length; i++) {                 // to get row num
			for (int j = 0; j < a[i].length; j++) {         // to get column for above row
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}


