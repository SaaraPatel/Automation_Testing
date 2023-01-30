package constructor;

public class cons5 
{

	cons5() {
		System.out.println("This is a zero-para constructor");
	        }
	public cons5(char c) {
		System.out.println("This is a single-para constructor");
	                     }
	cons5(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	                          }
	cons5(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	                             }
	cons5(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	                             }
	public static void main(String[] args) {
		cons5 c1 = new cons5();
		cons5 c2 = new cons5(10, 20);
		cons5 c3 = new cons5('d');
		cons5 c4 = new cons5(10d, 20);
		cons5 c5 = new cons5(10, 20.45);
	}

	


// * Constructor Overloading: more than on constructor in a class 
 //* Rule: 1. type of args differ or 
// * 		 2. number of args differ or 
 //* 		 3. position of args differ
// * 
 
	}


