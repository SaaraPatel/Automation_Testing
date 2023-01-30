package oopsbasics;

//public class inheritance2 {

		class testing10{                   //default constructor
			                 
			void callingFromVoda() {        //method
				System.out.println("Vodaphone network busy");
			}
		}                                      //1 class closed             
		
		class testing20 extends testing10{          // child20 extends parent10
			//default constructor with default super()
			
			void callingFromIdea() {
				System.out.println("Get Idea sirji");
			}
		}
		
		class testing30 extends testing20{           //child30 extends parent20
			//default constructor with default super()
			void callingFromAirtel() {
				System.out.println("try evrything");
			}
		}
		public class inheritance2 extends testing30 {           //exmp child extend parent30
			//default constructor with default super()
			void callingMe() {
				System.out.println("I am calling....");
			}
			
		
			public static void main(String[] args) {
				inheritance2 e1=new inheritance2();
				
				e1.callingMe();
				e1.callingFromAirtel();
				e1.callingFromIdea();
				e1.callingFromVoda();
		
	}
}

