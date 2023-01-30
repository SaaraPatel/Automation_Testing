package StringExample;

public class string_EXP9 {
	public static void main(String[] args) {

		String s2="1235";
		System.out.println("s2 :"+s2);
		
		//int sum=s2+100;//compile time error, because we can't store String into int
		
		//if String object contains int value, dn before using it for any arithmetic operation first convert it into int
		
		int num=Integer.parseInt(s2);         //it will  converted in integer 1235
		int sum=num+100;        // 1235+100= 1335
		System.out.println("Result: "+sum);
	}

}
