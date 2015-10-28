package momentum;

import java.util.Scanner;

public class Momentum {
	
	public static void main(String [] args){
		
		double mass;
		double velocity;
		double momentum;
		
		Scanner m = new Scanner(System.in);
		Scanner v = new Scanner(System.in);
		
		System.out.println("Write Mass here: ");
		mass = m.nextDouble();
		System.out.println("Write Velocity here: ");
		velocity = v.nextDouble();
		
		momentum = mass * velocity;
		System.out.print("Momentum: ");
		System.out.println(momentum);
		System.out.print("Kinetic Energy: ");
		System.out.println(mass * velocity * velocity / 2);
		
	}
}
