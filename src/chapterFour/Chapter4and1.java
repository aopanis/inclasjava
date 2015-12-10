package chapterFour;

import java.util.Scanner;

public class Chapter4and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Write first double then second double: ");
		int firstDouble = reader.nextInt();
		int secondDouble = reader.nextInt();
		
		if (firstDouble >= secondDouble) {
			System.out.println(Math.floor(firstDouble / secondDouble) +  "\n" + firstDouble % secondDouble);
		}
		else {
			System.out.println(Math.floor(secondDouble / firstDouble) + "\n" + secondDouble % firstDouble);
		}
		
	}

}
