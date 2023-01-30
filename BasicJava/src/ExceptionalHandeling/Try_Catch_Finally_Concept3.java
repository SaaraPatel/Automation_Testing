package ExceptionalHandeling;

public class Try_Catch_Finally_Concept3 {

	public static void main(String[] args) {

		try {
			                 // below code do not throw any exception
			int data = 25 / 0;
			System.out.println(data);
		}
		                       // catch won't be executed
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled...");
		}
		                     // executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}

}
// in this we can write try catch and finally
// in finally it is compulsory part for execution,
//even any aception is occures or not handlede, still finally will execute its data
