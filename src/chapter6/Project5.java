package chapter6;

import chapter6.BankAccount;
import java.util.Scanner;
public class Project5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Input name, balance, deposit, and withdrawl");
		String name = reader.nextLine();
		int balance = reader.nextInt();
		int deposit = reader.nextInt();
		int withdrawl = -(reader.nextInt());
		BankAccount b1 = new BankAccount(name, balance);
		b1.BalanceMutator(deposit);
		b1.BalanceMutator(withdrawl);
		
		System.out.println(b1);
	}

}
