package practiceMethodConcept;

public class MethodPractise {

	String username;
	String password;
	int age;
	double salary;
	
	public String login(String username,String password) {
		
		return ("Login is successfull"+" " + username +" "+ password);
	
	}
	
	public void logout() {
		System.out.println("Logout is successfull");
	}
	
	// functions returns int(Store)
	public int add() {
		int a=10;
		int b= 20;
		int z = a+b;
		return z;
		
	}
	
	//function returns nothing
	public void name() {
		String name= "amit";
		System.out.println("Name is "+" "+ name);
	}
	
	//input parameter input argument
	public int multiply(int a, int b) {
		int z= a*b;
		System.out.println("The Answer is "+" "+ z);
		return z;
		
	}
	
	public static void main(String[] args) {
		
		MethodPractise mp= new MethodPractise();
		System.out.println(mp.add());// direct print
		int z1= mp.add();
		System.out.println("My addition is"+" "+ z1);// assigning variable 
		
		
		
		
		//mp2.multiply(3, 4)
	    //mp1.name();
	    
	    MethodPractise mp2= new MethodPractise();// when to use this
	    mp2.multiply(5, 9);
	    
	    
	    MethodPractise mp3= new MethodPractise();
	    String Credential=mp3.login("a@gmail.com", "pass1234");
	    System.out.println(Credential);
	    System.out.println(mp3.login("a@gmail.com", "pass1234"));
	    
	    
	   
	    
	    
		
		
	
		
		
		
		
		
		
		

	}

}
