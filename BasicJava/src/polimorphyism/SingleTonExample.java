package polimorphyism;

class Testing{
	/*
	 * for singleton class
	 * 1. class constructor should be private
	 * 2. create static instance of current class
	 * 3. create static method that will return current class instance(refer step2)
	 */
	private Testing() {        //1.class const is private
		System.out.println("I am Testing class constructor");
	}
	static Testing t1=new Testing(); //2. create static object of currunt const.class
	
	public static Testing getInstanceOfTesting() {   //3. static method that return current class object
		return t1;
	}
	
	void calling() {
		System.out.println("Calling is getting executed");
	}
	
}
public class SingleTonExample {
	public static void main(String[] args) {


//		Testing t1=new Testing();// won't be able to create instance as its constructor is declared as private
//		t1.calling();

		Testing t1=Testing.getInstanceOfTesting();
		t1.calling();
		Testing t2=Testing.getInstanceOfTesting();
		t2.calling();

	}
}
