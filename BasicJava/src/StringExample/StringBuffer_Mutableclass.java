package StringExample;

public class StringBuffer_Mutableclass {
	
	public static void main(String[] args) {

	String str="Abc";

	StringBuffer_Mutableclass sb=new StringBuffer_Mutableclass("Hello "); 
	System.out.println("Original StringBuffer value: "+sb);
	                                                      //Hello 
     sb.append("Java");             	//now original string is changed  
	System.out.println(sb);       //Hello Java  
	
	 sb.insert(5,"Pune");          //now original string is changed  
	System.out.println(sb);       //HelloPune Java   
	
	sb.replace(1,3,"XXX");            //
	System.out.println(sb);            //HXXXloPune Java   
	
	sb.delete(1,4);  //
	System.out.println(sb);//HloPune Java 
	
	StringBuffer_Mutableclass s1=new StringBuffer_Mutableclass("Bangalore is known for IT");
	s1.reverse();  
	System.out.println(s1);//
	System.out.println("*********************************************");
	
	StringBuffer s2=new StringBuffer();
	System.out.println(s2.capacity());//default 16  
	s2.append("Hello");  
	System.out.println(s2.capacity());             //now 16  
	s2.append("java is my favourite language");  
	System.out.println(s2.capacity());          //now (16*2)+2=34 i.e (oldcapacity*2)+2  
	s2.append("I am from automation area");  
	System.out.println(s2.capacity());     //now (34*2)+2=70 i.e (oldcapacity*2)+2
	

	}
	public StringBuffer_Mutableclass(String string) {
		// TODO Auto-generated constructor stub
	}


	private void append(String string) {
		// TODO Auto-generated method stub
		
	}

	private void reverse() {
		// TODO Auto-generated method stub
		
	}

	private void delete(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void insert(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private void replace(int i, int j, String string) {
		// TODO Auto-generated method stub
		
	}

}
