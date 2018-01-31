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
	
	
	fw.write("Ingredients:");
	while(true) {
		System.out.print("Enter ingredient: ");
		StreamF.setWriteinFile(scan.nextLine());
		if(StreamF.getWriteinFile().equals("")) {
			break;
		}
		else {
			fw.write(StreamF.getWriteinFile());
		}
		fw.write("");
		}
	
	
	fw.write("Steps:");
	while(true) {
		System.out.print("Enter Step: ");
		StreamF.setWriteinFile(scan.nextLine());
		if(StreamF.getWriteinFile().equals("")) {
			break;
		}
		else {
			fw.write(StreamF.getWriteinFile());
		}
		fw.write("");
		}

	fw.close();
		
	
	}
}
