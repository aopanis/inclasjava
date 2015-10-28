package chapterFour;

import java.util.Scanner;

public class Chapter4and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int count = reader.nextInt();
		double piEst = 0;
		
		for(int i = 0; i < count; i++){
			
			piEst = piEst + Math.pow(-1,i) / (1 + 2 * i);
			
		}
		System.out.println(4 * piEst);
	}

}
