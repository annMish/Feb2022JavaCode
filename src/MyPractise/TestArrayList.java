package MyPractise;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList ar = new ArrayList();

		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		System.out.println(ar);//[100, 200, 300] direct print
		
		System.out.println(ar.get(1));
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		//System.out.println(hi=" "+ ar.size()-1);

		
		

	}

}
