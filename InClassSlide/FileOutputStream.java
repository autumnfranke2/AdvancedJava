package InClassSlide;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("Example.txt");
		fw.write("First line of the  text file.");
		fw.write('\n');
		fw.write("Second line of the text file.");
		fw.write('\n');
		fw.close();

	}

}
