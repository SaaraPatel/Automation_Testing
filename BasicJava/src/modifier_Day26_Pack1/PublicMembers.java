package modifier_Day26_Pack1;



// in public modifier we can access from in same class,package and
//from different class ,package ,but need to create class as public 
//and all variable as should be public

              /// class1/////////
public class PublicMembers {
	
	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {		
		PublicMembers p1=new PublicMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

                //// class2//////
class AccessPublicMembers {

	public static void main(String[] args) {		
		PublicMembers p1=new PublicMembers();
		
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
member can be access from anywhere but make sure that class should be declared as public
*/