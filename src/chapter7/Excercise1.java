package chapter7;
import java.util.*;
public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();
		int randomNumber = generator.nextInt(101);
		int numberGuessed = 5000;
		while(numberGuessed != randomNumber){
			System.out.println("Input Guess... ");
			numberGuessed = reader.nextInt();
			if(numberGuessed < 100 & numberGuessed > 0){
				if(numberGuessed > randomNumber){
					System.out.println("Too high");
				}else if(numberGuessed < randomNumber){
					System.out.println("Too low");
				}else{
					System.out.println("You got it");
				}
			}else{
				System.out.println("Value not in range of acceptable values");
			}
		}
		
	}

}
