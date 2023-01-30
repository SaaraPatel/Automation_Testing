package Abstractexample;


abstract class fruit{           //abstract class
	
	abstract void color();     //abstract method,incomplete
	abstract void look();
		
		 void Apple() {         //non abstract method
			System.out.println(" fruit is sweet");	
		}	
}
//1st is-A relationship
	 class flower extends fruit{      //flower inherite fruit
		 void color() {                // child class provide method of parent class
			 System.out.println("Apple is red");
		 }
		 void look() {                //provide parent class method
			 System.out.println("Apple is round");
		 }
		 
		 
		public void smell() {          //child class method
			System.out.println(" flower smells good");
				
	}
}	
// 2nd is -A relationship
	 class car extends flower{
	
	 
	 		public void smell() {
	 			
	 		}
	 		 void look() {
	 	}
	 		 void color() {
	 			 
	  }
	 		 
	 		  
	 		 public void type() {
	 			 System.out.println(" it is fourwheeler");
	 			 
	 			 try {
	 				 
	 			 } catch (Exception E) {
	 				 System.out.println(E);
	 			 }
	 		 } 
	 } 	

public class abstractPracticeExm {

	public static void main(String[] args) {
		fruit fr= new flower();
		fr.Apple();
		fr.color();
		System.out.println(":" +fr.toString());
		System.out.println(":" +fr.hashCode());
		System.out.println(":" +fr.equals(fr));
		
		
		
		
  		flower obj=new flower();
        	obj.Apple();
        	obj.color();
        	obj.look();
        	obj.smell();
        	 
        car obj1=(car) new flower();          //explicit upcasting
        obj1.Apple();
    	obj1.color();
    	obj1.look();
    	obj1.smell();
        obj1.type();
        
        fruit obj2= new car();        
        obj1.Apple();
    	obj1.color();
    	obj1.look();
    	obj1.smell();
        obj1.type();
    	
        	
	}
}

