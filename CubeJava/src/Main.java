import java.util.Scanner;
/**
 * This main method will call on the methods surface area and volume
 * */
public class Main {
	public static void main(String[] args) {
		
		
		System.out.println("Enter the length of one side");
		Scanner input = new Scanner(System.in);  //The Scanner
		double tm; // variable name tm for the user input
		tm = input.nextDouble(); 
		Cube cube = new Cube(tm); // The new cube
		System.out.println(cube.surfaceArea()); //displays the surface area function
		System.out.println(cube.volume()); //displays the volume function
	}
}
