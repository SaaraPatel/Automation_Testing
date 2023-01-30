package Array_ObjectExample_nonstatic;

public class object_EXP2  extends Demo{        //demo call its subclass which is inbuilt/default object class
	
		/////////////// Driver code////////////////////
		public static void main(String args[]) {
			
			object_EXP2 s = new object_EXP2();
			                                     // Below two statements are equivalent
			System.out.println(s);      //s.toString() -->string representation of an object, fullyqualified value
			System.out.println(s.toString());            //string representation of an object
			System.out.println(s.hashCode());  //it convert hexadecimal address in to decimal and return the value
			
			Demo d1=new Demo();
			System.out.println(d1);
			System.out.println(d1.toString());	
			System.out.println(d1.hashCode());//	
	
		}
}
	
	