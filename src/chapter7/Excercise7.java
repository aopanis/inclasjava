package chapter7;

public class Excercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height;
		int width;
		for(height = 1; height < 10; height++){
			width = 10 - height;
			int area = width * height;
			int perimeter = (2 * width) + (2 * height);
			System.out.println("Area: " + area + " Perimeter: " + perimeter);
		}
	}

}
