package MyPractise;

import java.util.ArrayList;

public class TestStudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer>  marksList= new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		marksList.add(300);
		marksList.add(400);
		
		
		System.out.println(marksList);//[100, 200, 300, 400]
		System.out.println(marksList.size());//4
		System.out.println(marksList.get(0));//100
		
		
		marksList.add(500);
		System.out.println(marksList.get(4));
		
		marksList.remove(1);
		
		System.out.println(marksList);//[100, 300, 400, 500]
		
		//marksList.remove(100);//IOB
		
		System.out.println(marksList);
		

		
	}

}
