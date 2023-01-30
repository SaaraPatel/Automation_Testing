package polimorphyism;

// overloading done in two/more method which carry same name it is compile time polymorphisum

class Shapes {
	public void area() {          // zero param method
		System.out.println("Find area ");
	}

	public void area(int r) {    // int parm method
		System.out.println("Circle area = " + 3.14 * r * r);
	}

	public void area(double b, double h) {    //param method     
		System.out.println("Triangle area=" + 0.5 * b * h);
	}

	public void area(int l, int b) {
		System.out.println("Rectangle area=" + l * b);
	}

}

public class overloadingpoly {
	public static void main(String[] args) {
		Shapes myShape = new Shapes(); // Create a Shapes object
		myShape.area();
		myShape.area(5);
		myShape.area(6.0, 1.2);
		myShape.area(6, 2);

	}
}


