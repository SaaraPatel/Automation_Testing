package Unchecked_ExceptionHandeling;

public class ExceptionHandelling_Try_catch {
		// defining a method
		public int divideNum(int m, int n)
		{
			int div = m / n;
			return div;
		}

		// main method
		public static void main(String[] args) {
			ExceptionHandelling_Try_catch obj = new ExceptionHandelling_Try_catch();
		//	System.out.println(obj.divideNum(45, 0));
			try {
				System.out.println(obj.divideNum(45, 0));
			} catch (ArithmeticException e) {
				System.out.println("\nNumber cannot be divided by 0");
			}
			System.out.println("Rest of the code..");

	}

}
