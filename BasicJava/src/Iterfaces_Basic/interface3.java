package Iterfaces_Basic;


interface Bank {           //interface 1(Parent class)
	float rateOfInterest();// method by default ----> public abstract
}
class SBI1 implements Bank {      //inherite by sbi1( child class)
	public float rateOfInterest() {   //subclass sbi1 providing method of parent class
		return 9.15f;            // in nethod return type is float so we have to return float value
	}
}
class PNB1 implements Bank {        //subclass inherite to bank(sub child class)
	public float rateOfInterest() {   // subclass need to provide method of parent class
		return 9.7f;      // in nethod return type is float so we have to return float value
	}
}
public class interface3 {
	
	public static void main(String[] args) {
		SBI1 s1=new SBI1();        //object of sbi
		System.out.println("SBI ROI: " + s1.rateOfInterest()); //disply the float value
		
		PNB1 p1=new PNB1();     // object of pnb
		System.out.println("PNB ROI: " + p1.rateOfInterest());  // disply the float valu
		
		Bank b = new PNB1();      // object of onb with ref value of bank
		System.out.println("ROI: " + b.rateOfInterest());   //disply float

	}

}
