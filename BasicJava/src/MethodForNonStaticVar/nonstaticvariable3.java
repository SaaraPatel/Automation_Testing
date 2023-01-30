package MethodForNonStaticVar;

public class nonstaticvariable3 {

	
		
		float a=15.56f;
		
		int add(int num1,int num2) 
		{
			 return (num1+num2);
		}	
	
		public static void main(String[] args) {
			
			nonstaticvariable3 obj=new nonstaticvariable3();
			//nonstaticvariable3 obj1=new nonstaticvariable3();

			System.out.println(obj.a);
			System.out.println(obj.add(12, 17));
			

	}

}
