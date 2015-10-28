package chapter6;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int x, y;
		System.out.println("Columns:...");
		x = reader.nextInt();
		
		System.out.println("Rows:...");
		y = reader.nextInt();
		
		List endChart = new ArrayList();
		
		for(int i = 0; i < x; i++){
			for(int p = 0; p < y; p++){
				endChart.add(i * p);
			}
		}
		Iterator it = endChart.iterator();
		System.out.print("x ");
		for(int v = 0; v < x; v++){
			System.out.print(v + " ");
		}
		System.out.println("\n");
		for(int z = 0; z < y; z++){
			System.out.print(z + " ");
			for(int v = 0; v < x; v++){
				System.out.print(it.next() + " ");
			}
			System.out.print("\n");
		}
	}
}
