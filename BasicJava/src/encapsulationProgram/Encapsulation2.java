package encapsulationProgram;

public class Encapsulation2 {

	private int empId=101;
	private char grade='A';
	
	//Getter: its a method which will help you to use private variables from outside the class
	/**create public method with return type as your required private data variable and return private variable, no parameter required
	 */
	//Setter: its a method which will help you to update private variable value from outside the class
	/*create public method with void return type and parameter should match with required private variable*/
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
class Testing{
	public static void main(String[] args) {
		Encapsulation2 e1=new Encapsulation2();
		
//		System.out.println(e1.empId);
//		System.out.println(e1.grade);
		System.out.println(e1.getEmpId());
		System.out.println(e1.getGrade());
		e1.setEmpId(201);
		e1.setGrade('C');
		System.out.println(e1.getEmpId());
		System.out.println(e1.getGrade());
	}

}
