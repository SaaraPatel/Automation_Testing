package modifier_Day26_Pack1;

// in protected class it can access same class,other class and from other package
//but for package access inheritance IS-A relationship needed
// variable,method should be declared with protected keyword

                        //// class 1/////

public class ProtectedMembers {
	protected int accNum=12345;
	
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		ProtectedMembers p1=new ProtectedMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}


          //// class 2 //////////

class AccessProtectedMembers {
	public static void main(String[] args) {

// from class 2 accessing member of class 1 by class1 object. 		
		ProtectedMembers p1=new ProtectedMembers();
		
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
protected members are mainly accessible within package only but can we access from another package using inheritance
*/