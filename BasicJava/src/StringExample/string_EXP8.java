package StringExample;

public class string_EXP8 {
	public static void main(String[] args) {
		
		String str="Pune"+1536;
		System.out.println(str);
		String s1="Mumbai";
		System.out.println(s1.concat("Pune"));
		String s2="Joker"+null;
		System.out.println("S2: "+s2);
		String str1=str.concat(null);
		System.out.println(str1);

	}// concept of concatenation and add(+)
	// in string we type + then it will add that thing
	//for cancatenation need to write concat word between two string
	// during string concatenation NUll will not connect because it is reserved key word in java it will show error

}
