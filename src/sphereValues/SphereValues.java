package sphereValues;

import java.util.Scanner;
public class SphereValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input Radius: ");
		radius = reader.nextDouble();
		System.out.print("Diameter: ");
		System.out.println(radius * 2);
		System.out.print("Circumference: ");
		System.out.println(radius * Math.PI * 2);
		System.out.print("Surface Area: ");
		System.out.println(radius * radius * 4 * Math.PI);
		System.out.print("Volume: ");
		System.out.println(radius * radius * 4 / 3 * Math.PI);
	}

}
