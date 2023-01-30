package oopsbasics;




class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}


  public class AbunduntmutiParent extends A2,B2{///here 2parent cant inheritate at same time
	
	AbunduntmutiParent(){
		super();//confusion becoz of 2 parent present statment cannt find immediate parent class of chilsclass
	}
	public static void main(String args[]) {
		AbunduntmutiParent obj = new AbunduntmutiParent();
		obj.msg();
	}
}
/**
is java supports multiple inheritance or not?
why java doesn't support multiple inheritance using classes?
*/

