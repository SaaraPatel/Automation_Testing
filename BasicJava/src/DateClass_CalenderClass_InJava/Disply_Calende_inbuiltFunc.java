package DateClass_CalenderClass_InJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Disply_Calende_inbuiltFunc {

	public static void main(String[] args) {

	Calendar cal= new Calendar.getInstance();
		SimpleDateFormat  sdf = new SimpleDateFormat("m/d/yyyy  :  hh.mm.ss");
		System.out.println(sdf.format(cal.getTime()));

	}

}
