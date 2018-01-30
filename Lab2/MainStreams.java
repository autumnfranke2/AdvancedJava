package Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainStreams {
	public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
	Stream StreamF = new Stream();
	
	
	System.out.print("Enter a recipe name for the file name: ");
	
	FileWriter fw = new FileWriter(scan.nextLine() + ".txt");
	fw.write("/n");
	
	System.out.print("Enter recipe name for title: ");
	fw.write(scan.nextLine());
	fw.write("/n");
	
	System.out.print("Enter ingredient: ");
	fw.write("Ingredients:");
	StreamF.WriteinFile(fw.write());
	fw.write("/n");
	
		
	System.out.print("Enter Step: ");
	fw.write("Steps:");
	StreamF.WriteinFile(fw.write());
	fw.write("/n");
	
	
	
	
	
	
	
	fw.close();
		
	
	}
}
/*
Your application should include a launcher class as well as an object class,
and should be properly object oriented. 

For IO, you can use any IO class you care to, 
but it is recommended to use a Scanner for input and a PrintWriter for output. 
If you use any external resources, be sure to cite them in comments.

*/

