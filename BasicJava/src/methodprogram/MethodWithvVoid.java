package methodprogram;

public class MethodWithvVoid {

	public static void main(String[] args)
	{
		addTwoNumbers(25, 50);
		addTwoNumbers(20, 10);
		addTwoNumbers(5, 50);
		addTwoNumbers(55, 50);
		addTwoNumbers(25, 70);
		addTwoNumbers(55, 40);
	}
	
	public static void addTwoNumbers(int num1,int num2) {  //parameter given in arg
		int res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
		//return; 
//only for void return statement is optional because if programmer doesn't write it java compiler will write on the behalf of programmer
	}
}

	


