package unaryOperator;

public class MixEquations {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;   // b=  0+ 2+ 3+ 3= 8
		
		System.out.println("a: "+a);// 
		System.out.println("b: "+b);// 
		System.out.println("**********************");
		
		a = -5;
		b = a-- + --a + --a + a;     // b= -5+ -7+ -8+ -8= -28
	    System.out.println("a: "+a);//  
		System.out.println("b: "+b);//  
		System.out.println("**********************");

		a = 21;
		b = --a + --a + --a + a + ++a + a++;  // b= 20+19+18+18+19+19= 113

		System.out.println(a);// 
		System.out.println(b);// 
		System.out.println("**********************");

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;   // -2+ -3+ -2+ -2+ 0+0+1=-8
		System.out.println(a);//
		System.out.println(b);//
		System.out.println("**********************");

	}

}
