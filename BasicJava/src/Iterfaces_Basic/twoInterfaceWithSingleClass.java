package Iterfaces_Basic;

// it is type of two interface inherite by single class
//in such case IS-A relationhsip "implements" keyword use for inherite

interface printable1 {
	
	   static int age = 30;           // non static value can access by obj/interface name
	
	   void print();           // in this only abstract method is used so, no complete body present
	}

interface showable {
	public void show();      //abstract void method
	
}



 class twoInterfaceWithSingleClass implements showable,printable1 {
	
	static int age= 45;

	
	public void print() {
		System.out.println(" Its print method(printable)");
	}
	
	public void show() {
		System.out.println("its show method(showable)");
	}
	 void write() {
		 System.out.println(" Its write method()");
	 }
	
	
	public static void main(String[] args) {
		
		twoInterfaceWithSingleClass obj= new twoInterfaceWithSingleClass();
		
		System.out.println("Age accecss by object name :" +obj.age);
		System.out.println("****************************************");
		System.out.println("Age accecss by interface name :" +printable1.age);
        System.out.println("**********************************************");
		System.out.println("Satic age access by class/interface name:"+twoInterfaceWithSingleClass.age);
		System.out.println("****************************************");
        obj.show();
        obj.print();
        
        
        
}
}