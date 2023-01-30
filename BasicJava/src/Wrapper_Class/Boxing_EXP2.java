package Wrapper_Class;

public class Boxing_EXP2 {
	public static void main(String[] args) {

		char c1='A';
		
		Character charObj1=new Character(c1);// 
		System.out.println(c1==charObj1);//
		Character charObj2=new Character('Z');// explicit
		
		Character charObj3='H';// implicit
		
		System.out.println("c1: "+c1);//
		System.out.println("charObj1: "+charObj1);
		System.out.println("charObj2: "+charObj2);
		System.out.println("charObj3: "+charObj3);
		
		boolean b=true;//
		Boolean bObj=new Boolean(b);//
		System.out.println(bObj==b);
	}

}
