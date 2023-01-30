package forLoopExamp;

public class factorialofNum {

	public static void main(String[] args) {
		
		int num=6; int i;
		int count=0;int fact=1;
		for(i=1; i<=num; i++) {
			//System.out.println(i);
			if(fact*num==fact) {
				System.out.println("Foctorial of num:" +fact);
				fact--;
			}
			
		}
		

	}

}
