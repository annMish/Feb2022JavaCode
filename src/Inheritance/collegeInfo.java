package Inheritance;

public class collegeInfo extends universityInfo {

	@Override
	public void science() {
		System.out.println("Coll overid science"); 
	}
	
	public void informationTech() {
		System.out.println("my own IT course"); 
	}
	@Override
	public void math() {
		System.out.println("Coll overid math"); 
	}
	
}
