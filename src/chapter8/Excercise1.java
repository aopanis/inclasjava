package chapter8;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Print initial number");
		double number = reader.nextInt();
		System.out.println("Print number if iterations");
		int iterations = reader.nextInt();
		double guess = 1;
		for(int i = 0; i <= iterations; i++){
			guess = ((guess + number / guess) / 2);
		}
		
		System.out.println(guess);
	}

}
