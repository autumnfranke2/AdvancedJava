/*Autumn Franke*/
import java.util.Scanner;
public class RadiusofSphere {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a radius (m): ");
		double r = input.nextDouble();
		System.out.println();
		
		double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3);
		
		System.out.printf("The area of the sphere with a radius of %.2f is %.2f", r, volume); /*.2 padds the decimal*/
	}

}
