package chapterFour;

import java.util.Scanner;

public class Chapter4and6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type initial numbers");
		double initialOrgs = reader.nextDouble();
		System.out.println("Type growth rate");
		double growthRate = reader.nextDouble();
		double growthTime = reader.nextDouble();
		System.out.println("Print time");
		double time = reader.nextDouble();
		
		for(int i = 1; i < 21; i++){
			
			initialOrgs = initialOrgs * growthRate / growthTime;
			
			System.out.println(initialOrgs);
			
		}
		
	}
}
