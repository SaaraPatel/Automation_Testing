package modifier_Day26_Pack1;


//private member can access with in class only
// not access in another class in same package,another package
// in private access only private variable,method access with private keyword

           // private class 1//
public class PrivateMembers {               //accessing private mem
		private int accNum=12345;          //private non static var with declare value
		private void displayAccNum() {    // private method
			System.out.println("Account Number: "+accNum);
		}
			
		public static void main(String[] args) {
			
// for accessing need to create object of private class			
			
			PrivateMembers p1=new PrivateMembers();
			System.out.println(p1.accNum);
			p1.displayAccNum();
	}
}



              // private class 2//
// here we are created 2nd class which access 1st class
//but it not happen becoz private class only access in only private class in same package
//from another class we cant access private member


class AccessPrivateMembers2 {
	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
