package ExceptionalHandeling;

public class Exceptionhandeling_EXP1 {
	public static void main(String[] args) {
		
		System.out.println("program starts from here...");
		
		//2. abnormal statements
		int[] empIds=new int[3];
		empIds[3]=101;        //here arry size is 3 and 0,1,2 indexed stored    //ArrayIndexOutOfBoundsException 
		System.out.println("Programs ends here...");

	}

}
