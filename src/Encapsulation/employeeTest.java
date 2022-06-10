package Encapsulation;


public class employeeTest {

	public static void main(String[] args) {
		
		employee obj = new employee();
		obj.setName("Roopa");
		obj.setAge(35);
		obj.setGender('F');
		obj.setActive(true);
		obj.setSalary(17500);
		
      
      System.out.println(obj.getEmployeeInfo());
		
		
	}

}

