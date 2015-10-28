package chapterFour;

import java.util.Scanner;

public class Chapter4and8 {

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
			int result = 0;
			int decimal = m;
			int multiplier = 1;
			while(decimal > 0){ 
				int remainder = decimal % base;
				decimal = decimal / base ;
				result = result + remainder * multiplier;
				multiplier = multiplier * 10;
				
			}
			
			System.out.println(result);
			
		}
		
	}

}
