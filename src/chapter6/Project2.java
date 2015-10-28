package chapter6;

import chapter6.Student;

public class Project2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		String result = student.validateData();
		if(result == null){
			
		}else{
			System.out.println(result);
		}
	}

}
