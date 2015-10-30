package chapter7;
import java.util.*;
public class Excercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largeNumber, smallNumber, remainder;
		Scanner reader = new Scanner(System.in);
		System.out.println("Print the large number then the small number");
		largeNumber = reader.nextInt();
		smallNumber = reader.nextInt();
		
		while(smallNumber != 0){
			remainder = largeNumber % smallNumber;
			largeNumber = smallNumber;
			smallNumber = remainder;
		}
		System.out.println(largeNumber);
	}

}
