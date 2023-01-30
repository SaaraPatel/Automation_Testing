package ExceptionalHandeling;

public class Try_Catch_concept1 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;          // arithmetic abnormal
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");  //so it will execute this catch state first
		} catch (Exception e) {           // parent class of all abnormalities
			System.out.println("Parent Exception occurs");
		}
		
		try {
			int a[] = new int[5];
			
			a[5] = 30 / 2;          // ans will 15 so it check the array size=5 but ans is just in 2 index
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");   //execute this statement
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
/*
* try block can have multiple catch block, but only one catch block will be executed 
* try can handle only one abnormal condition at a time
*/
	