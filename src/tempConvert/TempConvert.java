package tempConvert;

import java.util.Scanner;

public class TempConvert {
	
	public static void main(String [] args) {
		
		Scanner reader = new Scanner(System.in);
		
		double kilometers;
		double nauticalMiles;
		double degrees;
		double minutes;
		
		System.out.println("Enter distance in Kilometers: ");
		kilometers = reader.nextDouble();
		
		degrees = kilometers * 90 / 10000;
		minutes = degrees * 60;
		nauticalMiles = minutes;
		
		System.out.print("The equivalent of Nautical Miles is: ");
		System.out.println(nauticalMiles);
	}
}
