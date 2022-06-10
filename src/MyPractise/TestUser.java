package MyPractise;
 
   

public class TestUser {
	
	  String name;
	  int age;
	  String city;
	
	  public static void main(String[] args) {

		TestUser u1= new TestUser();
		u1.name= "Amit";
		u1.age= 30;
		u1.city="Mumbai";
		//System.out.println(u1.name);
		  
					  
		TestUser u2= new TestUser();
		u2.name= "Ritu";
		u2.age= 35;
		u2.city="Mumba";
		//System.out.println(u2.name);
		
		
		
		
		TestUser u3= new TestUser();
		u3.name= "Anu";
		u3.age= 40;
		u3.city="Mumb";
		//System.out.println(u3.name);
		
		
//		System.out.println(u1.name + " "+u1.age+ " " +u1.city  );
//		System.out.println(u2.name + " "+u2.age+ " " +u2.city  );
//		System.out.println(u3.name + " "+u3.age+ " " +u3.city  );
		
		u1=u2;
		
//		System.out.println(u1.name + " "+u1.age+ " " +u1.city  );
//		System.out.println(u2.name + " "+u2.age+ " " +u2.city  ); 
//		System.out.println(u3.name + " "+u3.age+ " " +u3.city  );
		
		u2=u3;
		
//		System.out.println(u1.name + " "+u1.age+ " " +u1.city  );
//		System.out.println(u2.name + " "+u2.age+ " " +u2.city  );
//		System.out.println(u3.name + " "+u3.age+ " " +u3.city  );
//				
		u3=u1;
		
		System.out.println(u1.name + " "+u1.age+ " " +u1.city  );
		System.out.println(u2.name + " "+u2.age+ " " +u2.city  );
		System.out.println(u3.name + " "+u3.age+ " " +u3.city  );
    }
}









