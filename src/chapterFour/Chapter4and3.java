package chapterFour;

import java.util.Scanner;

public class Chapter4and3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		double minutes = reader.nextDouble();
		
		if(minutes >= 2){System.out.println(1.15 + (minutes-2) * .5);}
		
		if(minutes < 2){System.out.println(1.15);}
		
	}

}
