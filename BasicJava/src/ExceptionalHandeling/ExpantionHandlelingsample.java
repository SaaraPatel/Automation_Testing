package ExceptionalHandeling;

public class ExpantionHandlelingsample {
	public static void main(String[] args) {
		
		int A= 10;
		System.out.println("Print int data: " +A);
		
		try {
		int Div= 10/0;
			
				System.out.println("Arithmetic Exception");
		      }
				catch (ArithmeticException E) {
				System.out.println("pr"
						+ " int Div" +E);
				System.out.println("end of program");
			}
		 }
}	

	
class ExpantionHandlelingsamples{
	public static void main(String[] args) {

	char Ab= 'B';
	{
		System.out.println("print chr:" +Ab);
	try {
	    double B= 20.2/0;
	   }
		catch(ArrayIndexOutOfBoundsException E) {
			System.out.println("array outoff boundary" +E);
			}
		catch(Exception E) {
			System.out.println("it is supperclass of all" +E);
		}
	    System.out.println("end part");
	   }
	}
  }

class ExpantionHandlelingsamples1{
	public static void main(String[] args) {

		boolean B= true;
		try {
		int[] ab = new int[5];
		System.out.println("print :" + ab.length);
	    ab[4]= 134;
		System.out.println(ab);
		}
		
		catch (Exception ca) {               //parent class declare first
			System.out.println("print it:" +ca);

		}
		catch (ArrayIndexOutOfBoundsException ca){
			System.out.println("print it:" +ca);
			
		}
		
	}
}

