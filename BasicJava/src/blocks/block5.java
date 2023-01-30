package blocks;

public class block5 {

	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class Blocks5..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks5..");
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		block5 b1 = new block5();
		System.out.println("---------------------------------");
		block5 b2 = new block5();
		System.out.println("main() ends");
	}

}
