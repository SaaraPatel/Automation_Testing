package Unchecked_ExceptionHandeling;
		//Throwing UserDefinedException 
		

///////////class represents user-defined exception//////////////
class UserDefinedException extends Exception {  //we can create own exception and it extened by exception claa
	   
	       UserDefinedException(String str) {   // constructor
				                    // Calling constructor of parent Exception
				super(str);           //super statement with string param
			}
		}
	
//Class that uses above MyException  

		public class userdefined_Exception3 {

			public static void validateAge(int age) throws UserDefinedException {
				
				if (age < 18) {
//					                 //throw Arithmetic exception if not eligible to vote
					throw new UserDefinedException("Person is not eligible to vote");
				} else 
				{
					System.out.println("Person is eligible to vote!!");
				}
			}

	public static void main(String args[]) {
			
		System.out.println("Main method started");
				try {
					validateAge(15);
				} catch (UserDefinedException E) {
					E.printStackTrace();
					System.out.println("Exception found: "+E);
				}
				System.out.println("Rest of the code..");
			}
		

		/**
		throw ---> is used to throw explicit exception from a method body, it can be checked or unchecked exception
			  ---> if its a checked exception dn you have handle it by using try-catch block or you can declare that exception
			  	   in method label using throws keyword in this case where ever this method gets called in that method you need
			  	   to handle to exception in order to continue the program

		*/
	

}
