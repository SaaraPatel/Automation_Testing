package encapsulationProgram;


class TestEncap {
	private int age = 25;
	private double salary = 45000;
	//getter setter need for encapsulation getter will read data
	//setter only write the data.
	public int getAge() {            //method for getter need public and return value
		return age;
	}
	public void setAge(int age) {    //setter need public with no return type
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}
public class Encapsulation1 {
	public static void main(String[] args) {
		
		TestEncap t1=new TestEncap();            //class object
//		System.out.println(t1.age);
//		System.out.println(t1.salary);
		System.out.println(t1.getAge());
		System.out.println(t1.getSalary());
		t1.setAge(35);
		t1.setSalary(58000);
		System.out.println("***************Updated values*****************");
		System.out.println(t1.getAge());
		System.out.println(t1.getSalary());
		
		TestEncap t2=new TestEncap();         //updated value
		System.out.println(t2.getAge());
		System.out.println(t2.getSalary());

	}

}
