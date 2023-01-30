package modifier_Day26_package2;

public class AccessPublicMembers {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		
		modifier_Day26_Pack1.PublicMembers p1=new modifier_Day26_Pack1.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
		modifier_Day26_Pack1.PublicMembers p2 = new modifier_Day26_Pack1.PublicMembers();
	}
}

// in this instated of creating import package we declare object 
//of class1 with package name..
//due to this it will easy to get access different object
//if we create single import line, it will able to access single object.
