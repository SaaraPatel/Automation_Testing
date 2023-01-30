package Abstractexample;

//all about abstract(it is imcomplete: it can access veriable both, mrthod,constructor,abstract both)
//Abstract class and method 
    abstract class zeeTv {           // Abstact class
    	
    	void kundaliBhagya() {       //non abstract method so,complete body
    		System.out.println(" I am from ZeeTV");
    	}
       	abstract void  Meet();      //abstract method , no body
      }
    
    
  //all about inheritance	
    class starplus{
   void Imli() {
			System.out.println("Imli fron starpluse");
		}
		void Anupamaa() {
			System.out.println("anupamaa from strplus");
		}		
		void YRKKH() {
			System.out.println(" it is YRKKH");
		
		}
		
    }	
	
	
	class colors extends starplus { //inheritance
			
		void Imli() { //same method with same contain from parent class
			super.Imli();     //overriding in inheritance
			System.out.println("Imli fron starpluse is overriding");
		}
		   
			 void BigBoss() {
			 System.out.println("Bigboss from colors");
						 
		 }
		 void jalakdikhlaja() {
			 System.out.println("Jhalakdikhlaja from colors");
		 }
	}
	
	class subTV extends colors{
				
		public float serialcount() {
			
			return 1234.3f;
		}
		
		public void kundaliBhagya() {           //subchild subtv has to call/provide all abstact void method to access
			System.out.println(" I am from zeetv");
			
		} 
	  public  void  Meet() {            //if subchild not provide void method the subclass will also act like abstact(incomplete),no object
		   System.out.println(" I am also from zee");
		   System.out.println("****************************");
			
		}
		  	void TMKOC() {
		  		System.out.println("I am from subTV");
		  	}
	}
	
	
	public class abstractInheritatemix {
	public static void main(String[] args) {
		
		
		colors c1 = new colors();
		c1.Imli();
		c1.Anupamaa();
		c1.YRKKH();
		c1.BigBoss();
		c1.jalakdikhlaja();

    	System.out.println("*************************");
	
		
	starplus c2= new colors();    //colors boject with starplus ref. ID
		c2.Anupamaa();
		c2.YRKKH();
		c2.Imli();

	//	c2.BigBoss();   // we cant access clolors serial becoz we make starplus ref. 
	//	c2.jalakdikhlaja();
		System.out.println("*************************");

		
		
		subTV s1= new subTV();
		 s1.Anupamaa();
		 s1.Imli();
		s1.Meet();
	    s1.kundaliBhagya();
		 s1.BigBoss();
		 s1.jalakdikhlaja();
		 s1.TMKOC();
		 System.out.println(" total serial count:" +s1.serialcount());
		
		 
		
		 
		
		 
		 
		
	}		
	
}
