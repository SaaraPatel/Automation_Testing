package oopsbasics;

class A {
	static int a = 10;      // static variable
	int b = 20;            //  Non static variable
	double c = 13.45;      // Non static variable
        }

class B {
	static int x = 30;       // static variable
	int y = 40;               //  Non static variable
	double z = 53.45;          //  Non static variable
        }

class C {
	static int p = 50;           // static variable
	int q = 60;                //  Non static variable
	double r = 66.45;           //  Non static variable
}

                    //main class

public class inheritance3 { 
	public static void main(String[] args) {     //main method
		 ///static member can access directly by class name
		/****************** Access static member class A members *********************/
		System.out.println("Class A static variable: "+A.a);
		/****************** Access static member class B members *********************/
		
		System.out.println("Class B static variable: "+B.x);
		/****************** Access static member class C members *********************/
		
		System.out.println("Class C static variable: "+C.p);
		/****************** Access non-static member class A members *********************/
		
		///Non static variable need object with class name
		A a1=new A();     ///class 1 has A name
		System.out.println("Class A non-static variable b: "+a1.b);
		System.out.println("Class A non-static variable c: "+a1.c);
		/****************** Access non-static member class B members *********************/
		B b1=new B();
		System.out.println("Class B non-static variable b: "+b1.y);
		System.out.println("Class B non-static variable c: "+b1.z);
		/****************** Access non-static member class C members *********************/
		C c1=new C();
		System.out.println("Class C non-static variable b: "+c1.q);
		System.out.println("Class C non-static variable c: "+c1.r);

	}

}
