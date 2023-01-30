package Iterfaces_Basic;


interface printable
{                               //interface only allow abstract method and variable
	
	abstract void print();  //abstract method,incomplete body
		void show();        //abstract method if keyword not written it will take default
}


interface drawable1 {
	int L=10;              //in interface variable are by default it is static so, they are access by interface name 
	static int B=13;
	
	void draw() ;
     public void rectangle();
     
}  


     
 class twoInterfaceInheritwOneInterface implements printable {
	
	public void show() {
	System.out.println("I am show");	
	}
	public void print() {
		System.out.println("I am print");
	}
		
	 void draw() {
			System.out.println("I am draw");
		}
	     public void rectangle() {
	    	 System.out.println("I am rectangle");
	     }


	
//blic classtwoInterfaceInheritwOneInterface{
	public static void main(String[] args) {

twoInterfaceInheritwOneInterface bj= new twoInterfaceInheritwOneInterface();
		
		bj.show();
		bj.draw();    
		bj.print();
	//System.out.println("L value: "+bj.L);	//in interface variable access by interface name only
	System.out.println("L value: "+drawable1.L);	
	System.out.println("*************************");
    //System.out.println("L value: "+bj.B);	
	System.out.println("L value: "+drawable1.B);//interface variable access by interface name

	
	
	}
	}
   
