package InClassSlide;

import java.io.IOException;
import java.io.InputStreamReader;

public class readinginput {
	
	public static void main(String args[]) throws IOException{  
	
	System.out.print("Enter text: ");
	InputStreamReader isr = new InputStreamReader(System.in);
	int letters = isr.read();
	System.out.println(isr.ready());
	System.out.print("You said: ");
	while(isr.ready()) {
		System.out.print((char) letters);
		letters = isr.read();
		
	}
	isr.close();
	
	
	}
}
