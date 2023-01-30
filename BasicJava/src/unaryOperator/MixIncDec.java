package unaryOperator;

public class MixIncDec {

	public static void main(String[] args) {
		
		int a = 55, b;
		b = a++;//     a=56 :b=55
		System.out.println("value of :" +b); //55
		System.out.println("value of :" +a); //56
		System.out.println("*******************");
		
		
		int x = a, y;   //x=56 : a=56    
		System.out.println("value is x:"+x);// 
		y = ++x;    // y=57 :x=57
		System.out.println(a);// 
		System.out.println(b);// 
		System.out.println(x);// 
		System.out.println(y);//
		System.out.println("*******************");

		
		int p = -10, q = 20, res;

		res = p++ + --q;           // res = -10 + 19= 9
		System.out.println("res: " + res);// 
		System.out.println("p: " + p);// 
		System.out.println("q: " + q);// 
		System.out.println("*****************************");
		
		
		int res1 = ++p + ++q;//      res1 =-8+20= 12
		System.out.println(res1);// 
		System.out.println("p: " + p);// 
		System.out.println("q: " + q);//

	}

}
