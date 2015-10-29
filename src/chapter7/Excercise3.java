package chapter7;
import java.util.*;
public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Input your grade");
		int input = reader.nextInt();
		if(input <= 100 & input >= 96){
			System.out.println("Your grade is: A+");
		}else if(input >= 92 & input <= 95){
			System.out.println("Your grade is: A");
		}else if(input <= 91 & input >= 90){
			System.out.println("Your grade is: A-");
		}else if(input <= 89 & input >= 86){
			System.out.println("Your grade is: B+");
		}else if(input <= 85 & input >= 82){
			System.out.println("Your grade is: B");
		}else if(input <= 81 & input >= 80){
			System.out.println("Your grade is: B-");
		}else if(input <= 79 & input >= 76){
			System.out.println("Your grade is: C+");
		}else if(input <= 75 & input >= 72){
			System.out.println("Your grade is: C");
		}else if(input <= 71 & input >= 70){
			System.out.println("Your grade is: C-");
		}else if(input <= 69 & input >= 66){
			System.out.println("Your grade is: D+");
		}else if(input <= 65 & input >= 62){
			System.out.println("Your grade is: D");
		}else if(input <= 61 & input >= 60){
			System.out.println("Your grade is: D-");
		}else if(input <= 59 & input >= 0){
			System.out.println("Your grade is: F");
		}else{
			System.out.println("Outside of range");
		}
		
	}

}
