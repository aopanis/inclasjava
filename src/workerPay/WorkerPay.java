package workerPay;
import java.util.Scanner;

public class WorkerPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wage = 0;
		double hours = 0;
		double hoursOvertime = 0;
		Scanner hourlyPay = new Scanner(System.in);
		Scanner hoursWorked = new Scanner(System.in);
		Scanner hoursWorkedOvertime = new Scanner(System.in);
		
		System.out.println("Monday");
		System.out.println("Wage?: ");
		wage = wage + hourlyPay.nextDouble();
		System.out.print("Hours Worked: ");
		hours = hours + hoursWorked.nextDouble();
		System.out.print("Hours Worked Overtime: ");
		hoursOvertime = hoursOvertime + hoursWorkedOvertime.nextDouble();
		
		System.out.println("Tuesday");
		System.out.println("Wage?: ");
		wage = wage + hourlyPay.nextDouble();
		System.out.print("Hours Worked: ");
		hours = hours + hoursWorked.nextDouble();
		System.out.print("Hours Worked Overtime: ");
		hoursOvertime = hoursOvertime + hoursWorkedOvertime.nextDouble();
		
		System.out.println("Wednessday");
		System.out.println("Wage?: ");
		wage = wage + hourlyPay.nextDouble();
		System.out.print("Hours Worked: ");
		hours = hours + hoursWorked.nextDouble();
		System.out.print("Hours Worked Overtime: ");
		hoursOvertime = hoursOvertime + hoursWorkedOvertime.nextDouble();
		
		System.out.println("Thursday");
		System.out.println("Wage?: ");
		wage = wage + hourlyPay.nextDouble();
		System.out.print("Hours Worked: ");
		hours = hours + hoursWorked.nextDouble();
		System.out.print("Hours Worked Overtime: ");
		hoursOvertime = hoursOvertime + hoursWorkedOvertime.nextDouble();
		
		System.out.println("Friday");
		System.out.println("Wage?: ");
		wage = wage + hourlyPay.nextDouble();
		System.out.print("Hours Worked: ");
		hours = hours + hoursWorked.nextDouble();
		System.out.print("Hours Worked Overtime: ");
		hoursOvertime = hoursOvertime + hoursWorkedOvertime.nextDouble();
		
		System.out.print("Pay = ");
		System.out.println(wage * hours + wage * 1.5 * hoursOvertime);
	}
}
