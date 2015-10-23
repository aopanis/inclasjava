package RedditProjects;

import java.util.Scanner;

public class EelOfFortune {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int problemCounter = 0;
		String secretWord, problemWord;
		String commonLetters = "", charactersUsed = "";
		Scanner reader = new Scanner(System.in);
		
		secretWord = reader.nextLine();
		problemWord = reader.nextLine();
		
		for(int i = 0; i < secretWord.length(); i++){}
		if(commonLetters.equals(problemWord)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}
