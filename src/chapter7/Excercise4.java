package chapter7;
import java.util.*;

public class Excercise4 {
	private static String getLetterGrade(int input){
		if(input <= 100 & input >= 96){
			return("A+");
		}else if(input >= 92 & input <= 95){
			return("A");
		}else if(input <= 91 & input >= 90){
			return("A-");
		}else if(input <= 89 & input >= 86){
			return("B+");
		}else if(input <= 85 & input >= 82){
			return("B");
		}else if(input <= 81 & input >= 80){
			return("B-");
		}else if(input <= 79 & input >= 76){
			return("C+");
		}else if(input <= 75 & input >= 72){
			return("C");
		}else if(input <= 71 & input >= 70){
			return("C-");
		}else if(input <= 69 & input >= 66){
			return("D+");
		}else if(input <= 65 & input >= 62){
			return("D");
		}else if(input <= 61 & input >= 60){
			return("D-");
		}else if(input <= 59 & input >= 0){
			return("F");
		}else if(input == -1){
			return null;
		}else{
			return("Value outside of range");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int numberOfGrades = 0;
		int gradesAdded = 0;
		int previousLowestGrade = 100;
		int previousHighestGrade = 0;
		int x = 0;
		while(true){
			System.out.println("Input Grade: ");
			x = reader.nextInt();
			if(x == -1){
				break;
			}else if(x < 0 | x > 100){
				System.out.println("Outside of range");
				continue;
			}
			gradesAdded += x;
			previousHighestGrade = Math.max(previousHighestGrade, x);
			previousLowestGrade = Math.min(previousLowestGrade, x);
			numberOfGrades++;
		}
		System.out.println("Average: " + getLetterGrade(gradesAdded / numberOfGrades) + " Lowest Grade: " + getLetterGrade(previousLowestGrade) + " Highest Grade: " + getLetterGrade(previousHighestGrade));
	}

}
