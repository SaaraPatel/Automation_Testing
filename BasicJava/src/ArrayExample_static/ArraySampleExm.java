package ArrayExample_static;

public class ArraySampleExm {
	public static void main(String[] args) {
	
String[] flowers12;          //declaration 1. datatype[] arrayname;
	flowers12 = new String[6];   //initialization arrayname=new arrayname [datasize/index];
	System.out.println(" string length:" +flowers12.length);
	System.out.println("************************************");
	
	//OR
	
String flowers[] = new String[4];  //2. declaration ,initialization
    flowers[0]= "Rose";
    flowers[1]= "Lotus";
    flowers[2]= "Lily";
    flowers[3]= "Jasmine";
    System.out.println("Array length:" +flowers.length);
    System.out.println("Print index 1 data:" +flowers[1]);
    System.out.println("Print index 3 data:" +flowers[3]);
    System.out.println("********************************");

		//OR
     	String[] flowers1= {"Lotus","Rose","Lily","Jasmine","dehliya"};  //dataype[] arrayname{};
        System.out.println("show data:" +flowers1.length);
        flowers1[4]="sunflower";
        System.out.println("update the flower of index4 it override dehliya:"   +flowers1[4]);
        System.out.println("***********************************");
//simple for loop
        
        for(int i = 0; i< flowers1.length;i++) {
        	System.out.println("Show the flower :" +flowers1[i]);
        	System.out.println("*******************************");
        }
        
 //for each loop
         for(String i : flowers1) {
        	 System.out.println("Show the flower data:" +i);
         }
        
        
	}
	
	
	
	
	
		}

