package chapter7;
import java.util.*;
public class Excercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();
		
		int die1, die2, dollars = 100, result, average = 0, count = 0;
		
		for(int i = 0; i <= 100; i++){
			while(dollars > 0){
				die1 = generator.nextInt();
				die2 = generator.nextInt();
				result = die1 + die2;
				if(result == 7){
					dollars += 4;
				}else{
					dollars--;
				}
				count++;
			}
			average += count;
			count = 0;
		}
		System.out.println("This is your average roll's till bust: " + average / 100);
	}

}
