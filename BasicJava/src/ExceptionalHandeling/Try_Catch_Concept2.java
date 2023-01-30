package ExceptionalHandeling;

public class Try_Catch_Concept2 {

	public static void main(String[] args) {

		try {
			
		int a[] = new int[5];
			a[5] = 30 / 0;   //basicly it is arithmatic exep.but in try parent class is first so it will show erro in subclasses abnormalities
		} catch (Exception e) {   //superclass should not be first,due to this other subclass abnormalites cant execute       
			System.out.println("common task completed");
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		}
		System.out.println("rest of the code...");
	}
}
/*
* unreachable code: a block of code which never executes by JVM
*
*/