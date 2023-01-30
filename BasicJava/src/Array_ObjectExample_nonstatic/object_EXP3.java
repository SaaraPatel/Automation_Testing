package Array_ObjectExample_nonstatic;

	class Demo123{         //this is parent class which also contain tostring,hashcode method
		void display() {
			System.out.println("I am display() of class Demo123");
		}
	}
	public class object_EXP3  extends Demo123{
		static int last_roll = 100;
		int roll_no;
		
		              // Constructor
		object_EXP3 ()
	    {
	        roll_no = last_roll;//100
	        last_roll++;//101
	    }
		void display() {
			System.out.println("I am display() of class ObjectClass2");
		}
		@Override
		public int hashCode() {           // this is contain in demo123 default class
			return roll_no;
		}
		// Driver code
		public static void main(String args[]) {
			object_EXP3  s = new object_EXP3 ();
			                       // Below two statements are equivalent
			System.out.println(s);
			System.out.println(s.toString());
			System.out.println("hashCode() value from ObjectClass2: "+s.hashCode());//
			s.display();//
			
			Demo123 d2=new Demo123();
			System.out.println(d2);
			System.out.println("hashCode() value from Demo123: "+d2.hashCode());		
		}

	}
	