package DateClass_CalenderClass_InJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Disply_currentDate_usingDateClass_inbuiltFuc {

	public static void main(String[] args) {

//To print Current Date and current Time using inbuilt Date class function
		
		Date d= new Date();         //create object of date class
		System.out.println("Current Date/Time: " +d.toString());  //converted object in to sting
		System.out.println("************************************");

		
		
// want to print customised format date/time new inbuilt object is
		// in argumment pass the required format
		
		SimpleDateFormat SDF= new SimpleDateFormat("d/M/yyyy  :  hh:mm");
		System.out.println(SDF.format(d));               //take the current date from d object
		
		
		SimpleDateFormat SDF1= new SimpleDateFormat("hh:mm:ss : yyyy.mm.dd");
		System.out.println(SDF1.format(d));               //take the current date from d object
		
		
	}
	
	
	

}
