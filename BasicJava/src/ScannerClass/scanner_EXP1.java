package ScannerClass;
import java.util.Scanner;
public class scanner_EXP1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter required number:");
		int num=sc.nextInt();
		cube(num);
	}
	
	static void cube(int num) {
		int res=num*num*num;
		System.out.println("Cube is : "+res);
	}

}
