package modifier_Day26_Pack1;

           ///class 1///
public class DefaultMembers {
	
	int accNum=12345;             //non static value
	void displayAccNum() {       //non abstarct method with body
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {		
		DefaultMembers p1=new DefaultMembers();    // object of defaultmember
		
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

          /// class 2/// 
class AccessDefaultMembers {

	public static void main(String[] args) {		
		DefaultMembers p1=new DefaultMembers(); //in 2nd class using
		     //class 1 object data is access
		
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
default member will be having visibility upto package level

*/