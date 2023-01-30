package modifier;

public class Modifiermix {
	private int num1 = 10;             //private
	int num2 = 20;                    //default
	protected int num3 = 30;         //protected
	public int num4 = 40;           //public

	public static void main(String[] args) {

		Modifiermix m1 = new Modifiermix();
		
		System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}
class AccessModifiers{
	public static void main(String[] args) {

		Modifiermix m1 = new Modifiermix();
		
		//System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}



