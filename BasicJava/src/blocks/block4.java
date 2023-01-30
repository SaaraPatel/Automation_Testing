package blocks;

public class block4 {
	/* non-static block or IIB*/// it not need any static key
 //in NSGV block it will execute main method then this
	{
		System.out.println("zero-param cons..."); //Non static globle variable
	}	
	
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		block4 b1=new block4();    //need object creation
		System.out.println("---------------------------------");
		block4 b2=new block4();
		System.out.println("main() ends");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");

	}

}
