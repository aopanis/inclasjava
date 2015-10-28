package minutesInYear;

public class MinutesInYear {
	
	public static void main(String [] args){
		
		int year;
		int days;
		int hours;
		int minutes;
		int seconds;
		
		year = 1;
		days = year * 360;
		hours = days * 24;
		minutes = hours * 60;
		seconds = minutes * 60;
		
		System.out.println(seconds);
	}
	
}
