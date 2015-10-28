package surfaceArea;

import java.util.Scanner;

public class SurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double length;
		double surfaceArea;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Write side length here: ");
		
		length = reader.nextDouble();
		
		surfaceArea = length * length * 6;
		
		System.out.print("Surface area = ");
		System.out.println(surfaceArea);
		
	}

}
