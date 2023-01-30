package constructor;

public class constuctor1 {

		int rollno;
		float fee;

		constuctor1(int rollno) 
		{
			this.rollno = rollno;
		}
		constuctor1(int rollno, float fee) 
		{
			this(rollno);                     // reusing constructor
			this.fee = fee;
		}
		void display() {
			System.out.println(rollno + " :" + fee);
		}
	}
	class ThisStatement3 
	{
		public static void main(String args[]) 
		{
			System.out.println("******Creating S1 object********");
			constuctor1 s1 = new constuctor1(111);            //
			
			System.out.println(s1.rollno + " :" + s1.fee);     //
			
			System.out.println("*******Creating S2 object*********");
			constuctor1 s2 = new constuctor1(112, 6000f);        //
			
			System.out.println(s2.rollno + " :" + s2.fee);       //
			System.out.println("*******Display()**************");
			
			s1.display();       //
			s2.display();        //
	}

}
