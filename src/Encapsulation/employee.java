package Encapsulation;


//Create Employee class
//define class vars with private: name, age, salary, isActive, Gender
//create getter and setter for each class private vars
//create getEmployeeInfo() method in Employe class which will return al the values of employee
//Test this feature:
//create EmployeeTest class 
//In main() method, create the object of Employee class
//set the values using set method
//call getEmployeeInfo() method and print all the employee values on the console.






public class employee {

	private String Name;
	private int Age;
	private double Salary;
	private boolean isActive;
	private char Gender;
	
		
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}



	public double getSalary() {
		return Salary;
	}



	public void setSalary(double salary) {
		Salary = salary;
	}



	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public char getGender() {
		return Gender;
	}


	public void setGender(char gender) {
		Gender = gender;
	}

	public String getEmployeeInfo() {
//		 String Name="Anu";
//		 int Age=20;
//		 double Salary=2000;
//		 boolean isActive=true;
//		 char Gender='M';
//		 
//		 System.out.println("My Name is" +" "+ Name);
//		 System.out.println("My Age is" +" "+ Age);
//		 System.out.println("My Salary is" +" "+ Salary);
//		 System.out.println("value" +" "+ isActive);
//		 System.out.println("I Am a" +" "+ Gender);
		  
		 String e1= Name+" "+ Age +" "+ Salary+" "+" "+isActive+" "+Gender;
		 return e1;  
		
	}


	public static void main(String[] args) {
		
		employee empinfo= new employee();
		System.out.println(empinfo.getEmployeeInfo());
	
		
		
	
	}
}
