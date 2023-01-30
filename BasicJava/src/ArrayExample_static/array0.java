package ArrayExample_static;

public class array0 {
	public static void main(String[] args) {

//Method 1.declaration & initialization of Array
		
	//String[] cars;    //declaration of car array
	//cars=new String[4];  //initialization of array
	// or
		
//Method 1.declaration & initialization of Array

	//String[] cars=new String[4];
		
	//cars[0]="Volvo";
	//cars[1]="BMW";
//	cars[2]="Ford";
//	cars[3]="Mazda";
		// or
	//Method 1.declaration & initialization of Array

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		// Access the Elements of an Array
		System.out.println(cars[0]);              //Volvo
		// Change an Array Element
		cars[0] = "Opel";
		System.out.println(cars[0]);          //Opel
		// array element count
		System.out.println(cars.length);        //4
		System.out.println("*********Normal for-loop***********");
		// iterate array elements using for loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("**************for-each loop*******************");
		// iterate array elements using for-each loop
		for (String i : cars) {
			  System.out.println(i);
			}
	}

}
