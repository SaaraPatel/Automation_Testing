package modifier_Day26_package2;

import modifier_Day26_Pack1.PrivateMembers;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}

// in private modifier we cant acess data from  other package
//its visibility is upto same class,another class but in same package