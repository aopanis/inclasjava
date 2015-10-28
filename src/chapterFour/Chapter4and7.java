package chapterFour;

import java.util.Scanner;

public class Chapter4and7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int base = reader.nextInt();
		
		int m = 2;
		System.out.println("Exponent");
		int exponent = reader.nextInt();
		
		if(exponent == -1){
			System.exit(0);
		}
		for(int i = 0; i < exponent; i++){
			
			m = m * 2;
			System.out.println(m);
			
		}
		
	}

}
