
public class Fibonacci {
int n1=0,n2=1,n3=0;
	
	public void FibSequence() {
		for(n3 = 0; n3 < 75;){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println("" + n3);
			
		}
		
	}
}
/*
 * Reference:
 * https://www.javatpoint.com/fibonacci-series-in-java
 */