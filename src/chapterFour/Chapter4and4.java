package chapterFour;

import java.util.Scanner;

public class Chapter4and4 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number greater than 0: ");
		int number = reader.nextInt();
		long product = 1;
		int count = 1;
		while (count <= number){
			product = product * count;
			System.out.println(product);
			count++;
		}
		System.out.println("The factorial of " + number + " is " + product);
		
	}
	
}
