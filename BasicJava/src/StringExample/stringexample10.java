package StringExample;

public class stringexample10 {
	public static void main(String[] args) {
		
		String S1= "JAVA_Tester";
		String S2= "Automation";
		String S3= "Manual";
		String S4= "JAVA_Tester";

		
		System.out.println("Print the string value: " +S1);
		System.out.println("Print the string value: " +S2);
		System.out.println("Print the string value: " +S3);
		System.out.println("Print the string value: " +S4);
//###################################################################
		System.out.println("Print the total leghth:" + S1.length());
		System.out.println("Print the index value: "+S1.charAt(0));
		System.out.println("Print the index value: "+S1.charAt(5));
		System.out.println("Print the laxt index: "+S1.lastIndexOf(S3));
        System.out.println("Print start with centence: "+S1.startsWith("Auto"));
        System.out.println("Print start with centence: "+S1.endsWith("Coder"));
        System.out.println("Print start with centence: "+S1.toUpperCase());
        System.out.println("Print start with centence: "+S1.toLowerCase());
        System.out.println("Print start with centence: "+S1.substring(4,8));
        System.out.println("Print start with centence: "+S1.isEmpty());
        System.out.println("********************************************");

   // in STRING compare two value based on address     
	System.out.println("Compare S1=S2: " +S1==S2);
	System.out.println("Compare S1=S2: " +S2==S3);
	System.out.println("Compare S1=S2: " +S1==S4);
    System.out.println("********************************************");

    // in STRING equals the the two param based on its value
    System.out.println("Equal the value  S1-S2: "+ S1.equals(S2));
    System.out.println("Equal the value  S2-S3: "+ S2.equals(S3));
    System.out.println("Equal the value  S1-S4: "+ S1.equals(S4));

	
	
	
	
	}
	
	
	

}
