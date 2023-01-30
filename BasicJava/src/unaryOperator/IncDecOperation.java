package unaryOperator;

public class IncDecOperation {

	public static void main(String[] args) {
		
		int A=10;
		int B=A++;
		System.out.println("print the value A:" +A);
		System.out.println("print the value B:" +B);
		System.out.println("**************************");
		
		
		int K= A++;
		System.out.println("print the value A:" +A);
		System.out.println("print the value K:" +K);
		System.out.println("**************************");
		
		
		int G= 23;
		System.out.println("print the value :" +G);
		System.out.println("print the value :" + ++G);
		System.out.println("print the value updated:" +G);
		System.out.println("print the value :" + --G);
		System.out.println("print the value :" + G++);
		System.out.println("print the value Updated G:" +G);
		System.out.println("print the value :" + G--);
	}

}
