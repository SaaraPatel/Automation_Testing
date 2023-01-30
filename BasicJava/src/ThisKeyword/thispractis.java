package ThisKeyword;

public class thispractis {

		int rollno;   //NGV
		int age;      //NGV
		
		void display(int rollno, int age)
		    {
			System.out.println("initial  Rn:"+ rollno); //02  //03 
			System.out.println("initial age:"+ age);  //12//17
			System.out.println("***************************");//**

			this.rollno =rollno;   
			this.age=age;			
			System.out.println("updated global roll1 :" +this.rollno); //02
			System.out.println("updated global age1:" +this.age);//12
			System.out.println("***************************");
						

		}
		
						
		public static void main(String[] args) {
			int rollno=01;        //  local var
			int age=15;           // lacal var
			
			System.out.println("student roll no:" +rollno);   //01
			System.out.println("student age:" +age);           //15
			System.out.println("***************************");   //**
			
			thispractis obj=new thispractis();    //object cret
					
			System.out.println("global roll no:" +obj.rollno); //NGV 0
			System.out.println("global age:" +obj.age);      //0
			System.out.println("***************************");//**

			obj.rollno=12;   //12
			obj.age=19;   ///19
			System.out.println("updated object RN:"+obj.rollno);
			System.out.println("updated object age:"+obj.age);

			
			obj.display(02, 16);   //calling
			obj.display(03,17);
			
			
		
		
	}

}
