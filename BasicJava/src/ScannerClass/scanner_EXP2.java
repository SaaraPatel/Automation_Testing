package ScannerClass;

import java.util.Scanner;

public class scanner_EXP2 {
	public static void main(String[] args) {
		
		int empId;          // local var
		char grade;          //local var
		boolean status;      // local var 
		double salary;
		
		//to read input from keyboard or to take input from user at runtime
		
		Scanner src=new Scanner(System.in);
		System.out.println("Enter empId: ");
		empId=src.nextInt();
		
		System.out.println("Enter grade: ");
		grade=src.next().charAt(0);
		
		System.out.println("Enter status: ");
		status=src.nextBoolean();
		
		System.out.println("Enter salary: ");
		salary=src.nextDouble();
		
		System.out.println("*****************************");
		System.out.println(empId+"\n"+grade+"\n"+salary+"\n"+status);

	}

}
