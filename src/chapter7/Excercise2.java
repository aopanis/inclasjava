package chapter7;
import java.util.*;
public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();
		int numberGuessed = 100;
		System.out.println("Did I get it");
		String correct = new String();
		correct = reader.nextLine();
		while(correct != "True" | correct != "true"){
			numberGuessed = 50;
			System.out.println(numberGuessed + "\nDid I get it right?");
			correct = reader.nextLine();
			if(correct == "too high"){
				numberGuessed /= 2;
			}else if(correct == "too low"){
				
			}else{
				System.out.println("You got it");
			}
			
		}
		
	}

}
