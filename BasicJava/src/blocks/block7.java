package blocks;

public class block7 {

	int age = 25;                       //non staticGV
	double salary = 15000.57;          //nonstatic GV
	
	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		block7 b1 = new block7();
		System.out.println("main() ends..");
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
		print();
	}

}
