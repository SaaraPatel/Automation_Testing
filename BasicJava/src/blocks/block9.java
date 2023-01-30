package blocks;

public class block9 {

		int age=25;                 //nonstaticGV
		static int pin=411015;      //static GV
		
		char display() {
			System.out.println("I am display");
			return 'a';
		}
		static int callMe() {
			System.out.println("Hi, Call me ");
			return 25;
		}
		public static void main(String[] args) {

	}

}
