package chapter6;

import chapter6.Fractions;

public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fractions f1 = new Fractions(1, 2);
		Fractions f2 = new Fractions(2, 3);
		
		System.out.println(f1.AccessorDenominator());
		System.out.println(f1.AccessorNumerator());
		
		System.out.println(f1.Add(f2));
		System.out.println(f1.Mult(f2));
		System.out.println(f2.toString());
		
	}

}
