package chapter6;

public class BankAccount {
	
	private String owner;
	private int balance;
	
	public BankAccount(String ownerName, int initialBalance){
		owner = ownerName;
		balance = initialBalance;
	}
	
	public String NameAccessor(){
		return owner;
	}
	
	public int BalanceAccessor(){
		return balance;
	}
	
	public void BalanceMutator(int amountChanged){
		balance += amountChanged;
	}
	
	public String toString(){
		return (owner + " " + balance);
	}
	
}