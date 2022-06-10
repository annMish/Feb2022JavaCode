package exceptionHandling;

public class TryCatchBlock {

	TryCatchBlock trycatch;
	String name;
	int age;
	
	
	public void catchblock() {
	
		TryCatchBlock trycatch= new TryCatchBlock();
		int age=trycatch.age= 4;
		String str= trycatch.name="local";
		
		System.out.println(age);
		}
		
			
	public static void main(String[] args) {
		
		TryCatchBlock trycatch= new TryCatchBlock();
		int age1=trycatch.age=10;
		trycatch.catchblock();
		System.out.println(age1);
		
		
		
		
	
		
		
	}
}
