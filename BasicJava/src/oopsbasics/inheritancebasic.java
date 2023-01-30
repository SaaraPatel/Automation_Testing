package oopsbasics;

 
	class testing1{                        // class1
		void callingFromVoda() {           // default method
			System.out.println("Vodaphone network busy");   //print
		}
	}
	class testing2{                   //class 2       
		void callingFromIdea() {      // 2 method
			System.out.println("Get Idea sirji");
		}
	}
	class testing3{                        //class 3
		void callingFromAirtel() {          // 3 method
			System.out.println("try evrything");
		}
	}
	
	
	public class inheritancebasic {                     // main class fron new 
		void callingMe() {                      // 4 method
			System.out.println("I am calling....");
		}
	
		
		public static void main(String[] args) {
			
			inheritancebasic e1=new inheritancebasic();
			e1.callingMe();
			testing1 t1=new testing1();
			t1.callingFromVoda();
			testing2 t2=new testing2();
			t2.callingFromIdea();
			testing3 t3=new testing3();
			t3.callingFromAirtel();

	}
	}


