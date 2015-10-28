package chapterFour;

import java.util.Scanner;

public class Chapter4and2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		double side1 = reader.nextDouble();
		double side2 = reader.nextDouble();
		double side3 = reader.nextDouble();
		
		if(side1 >= side2 & side1 >= side3) {
			
			System.out.println(side1 * side1 == side2 * side2 + side3 * side3);
			
		}
		if(side2 >= side1 & side2 >= side3) {
			
			System.out.println(side2 * side2 == side1 * side1 + side3 * side3);
			
		}
		if(side3 >= side1 & side3 >= side2) {
			
			System.out.println(side3 * side3 == side1 * side1 + side2 * side2);
			
		}
		
	}

}
