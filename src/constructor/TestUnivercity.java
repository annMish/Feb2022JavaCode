package constructor;

 import java.time.LocalDate;
import java .util.ArrayList;

import classAssignment.University;


 public class TestUnivercity {

	public static void main(String[] args) {
		

		ArrayList<String> str= new ArrayList<String>();
		str.add("Piano");
		str.add("Guitar");
		
		// localdate class object created						
	   LocalDate now = LocalDate.parse("2022-03-10");
		
		
		
		University uni= new University("UNC", "USA", now ,str);
		uni.getName();
		System.out.println("University Name"+" "+ uni.getName());
		System.out.println("Estd date"+" "+uni.getEstablishedDate());
		System.out.println("University Country"+" "+uni.getCountry());
		System.out.println("Course List"+" "+uni.getCourseList());
		
		
		
	}

}
