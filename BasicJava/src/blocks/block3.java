package blocks;

public class block3 {

	block3(){      // no parameter wriiten
		System.out.println("zero-param");
	}
	block3(int i){              //int single parameter
		System.out.println("int-param");
	}
	
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block1 of class Blocks3..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		block3 b1 = new block3();
		System.out.println("---------------------------------");
		block3 b2 = new block3(10);
		System.out.println("main() ends");
	}

}
