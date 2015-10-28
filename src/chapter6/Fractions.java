package chapter6;

public class Fractions{
	
	private int numerator;
	private int denominator;
	private int numeratorFinal;
	private int denominatorFinal;
	
	public Fractions(int x, int y){
		numerator = x;
		denominator = y;
	}
	
	public int AccessorNumerator(){
		return numerator;
	}
	
	public int AccessorDenominator(){
		return denominator;
	}
	
	public String Add(Fractions f){
		int otherNumerator = f.AccessorNumerator();
		int otherDenominator = f.AccessorDenominator();
		
		numeratorFinal = numerator * otherDenominator + otherNumerator * denominator;
		denominatorFinal = denominator * otherDenominator;
		
		return (numeratorFinal + " / " + denominatorFinal);
	}
	
	public String Sub(Fractions f){
		int otherNumerator = f.AccessorNumerator();
		int otherDenominator = f.AccessorDenominator();
		
		numeratorFinal = numerator * otherDenominator - otherNumerator * denominator;
		denominatorFinal = denominator * otherDenominator;
		
		return (numeratorFinal + " / " + denominatorFinal);
	}
	
	public String Mult(Fractions f){
		int otherNumerator = f.AccessorNumerator();
		int otherDenominator = f.AccessorDenominator();
		
		numeratorFinal = numerator * otherNumerator;
		denominatorFinal = denominator * otherDenominator;
		
		return (numeratorFinal + " / " + denominatorFinal);
	}
	
	public String Div(Fractions f){
		int otherNumerator = f.AccessorNumerator();
		int otherDenominator = f.AccessorDenominator();
		
		numeratorFinal = numerator / otherNumerator;
		denominatorFinal = denominator / otherDenominator;
		
		return (numeratorFinal + " / " + denominatorFinal);
	}
	
	public String toString(){
		return (numerator + " / " + denominator);
	}
}