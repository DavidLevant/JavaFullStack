import java.lang.Double;
import java.util.Scanner;
/**
 * @author levant
 * This program will calculate the length of the sides
 *  
 *  */
 

public class Cube {
	
	    double sideLength; // The length of one side
	 
    	public Cube(double sideLength) {  //The constructor for cube.
		this.sideLength = sideLength;
		
		}
	
	/**
	 * @returns the surface area
	 * */
	public double surfaceArea() { //The method to calculate the surface area
		
		return 6 * sideLength * sideLength;
		}
	/**
	 * @return returns the Total Volume
	 * */
	public double volume() {  //The method to calculate the volume
		
		return sideLength * sideLength * sideLength;
		
	}
	
		

		
}
