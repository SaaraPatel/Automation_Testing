package Array_ObjectExample_nonstatic;

	class TestSample{                //superclass
		void callMe() {              //superclass method
			System.out.println("Hello");
		}
	}
	public class object_EXP4 extends TestSample{         //

		static int last_roll = 100;
		int roll_no;
		// Constructor
		 object_EXP4()
	    {
	        roll_no = last_roll;
	        last_roll++;
	    }
		@Override
		public int hashCode() {
			return 505;
		}
		@Override
	    public String toString()
	    {
	        return "BasicCoreJava";
	    }
	
		// Driver code
		public static void main(String args[]) {
					
		 object_EXP4 s = new object_EXP4();
			                      // Below two statements are equivalent
			System.out.println(s.hashCode());
			System.out.println(s);
			 TestSample t1=new TestSample();
			 System.out.println(t1);
			 System.out.println(t1.hashCode());
		}
	}
	
	
	
