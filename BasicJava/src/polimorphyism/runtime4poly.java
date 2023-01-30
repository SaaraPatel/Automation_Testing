package polimorphyism;

class Bike {
	int speedlimit = 90;
}
class Honda3 extends Bike {
	int speedlimit = 150;
}
public class runtime4poly {
	public static void main(String[] args) { 
		
	  Bike obj=new Honda3();  //honda is object which call immediadte parent bike
	  System.out.println(obj.speedlimit);  //90
	}
}


