package MyPractise;

import java.util.ArrayList;

public class TestEmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar= new ArrayList();
		
		
		//System.out.println(ar.size());
		
		ar.add(100);
		ar.add("Testing");
		ar.add('a');
		ar.add(10.22);
		
		//System.out.println(ar);//[100, Testing, a, 10.22]
		//System.out.println("li ="+0);//li =0
		//System.out.println("length ="+ar.size());//length =4
		//System.out.println(ar.size());//4)
		
				
		for(int i=0;i<=10;i++) {
				//System.out.println(i);
				
				}
				
		
		
		//Employee Info
		ArrayList<Object> empInfo= new ArrayList<Object>();
		
		empInfo.add("Test");
		empInfo.add(22);
		empInfo.add('a');
		empInfo.add(12.22);
		empInfo.add("Pie");
		
		//System.out.println(empInfo);
		//System.out.println(empInfo.get(2));
		
		
		for(int i=0;i<=empInfo.size();i++) {
			//System.out.println(i);
			//System.out.println(empInfo.get(i));//why IOB
			
						}
		
	for(Object e : empInfo) {
		System.out.println(e);
	}
	  }
	}
