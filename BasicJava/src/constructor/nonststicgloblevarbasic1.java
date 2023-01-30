package constructor;

public class nonststicgloblevarbasic1 {

	
     	int age=11;
		
		void calling(int age) 
		{
			System.out.println("I am calling method:" +age);
		}
	
   public static void main(String[] args) 
		{
			nonststicgloblevarbasic1 e1=new nonststicgloblevarbasic1();
			System.out.println(e1.age);
			e1.age=18;
			System.out.println(e1.age);
			
			e1.calling(56);
		
					
	}
	
}

