package classAssignment;

import java.time.LocalDate;
import java.util.ArrayList;

public class University {

	private String name;
	private String country;
	private LocalDate establishedDate;
	private ArrayList<String> CourseList;
	
	
	
	
	public University(LocalDate establishedDate) {
		this.establishedDate = establishedDate;
	}


	public University(String name) {
			this.name = name;
	}

	
	public University(String name, LocalDate establishedDate) {
		this.name = name;
		this.establishedDate = establishedDate;
	}

	
	

	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}


	public University(String name, String country, LocalDate establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}


	public University(String name, String country, LocalDate establishedDate, ArrayList<String> courseList) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.CourseList = courseList;
	}

	
	


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public LocalDate getEstablishedDate() {
		return establishedDate;
	}


	public void setEstablishedDate(LocalDate establishedDate) {
		this.establishedDate = establishedDate;
	}


	public ArrayList<String> getCourseList() {
		return CourseList;
	}


	public void setCourseList(ArrayList<String> courseList) {
		this.CourseList = courseList;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
