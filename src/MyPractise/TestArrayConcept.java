package MyPractise;

import java.util.Arrays;

public class TestArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int array
		
		 int bookingNo []= new int [5];
		 
		 bookingNo[0]= 5;
		 bookingNo[1]= 6;
		 bookingNo[2]= 7;
		 bookingNo[3]= 8;
		 bookingNo[4]= 9;
		 
		 
		 //System.out.println(bookingNo);//IOB
//		 System.out.println(Arrays.toString(bookingNo));//printallsame line[5, 6, 7, 8, 9]
//		 System.out.println(bookingNo.length);//5
//		 System.out.println("Li :"+0);//Li:0
//		 System.out.println("Hi : "+ (bookingNo.length-1));//Hi : 4
//		 
		 //System.out.println(bookingNo[2]);//particular index=7
		 
		 //To Print All index Enhanced Loop along with index
//		 int counter =0;
//		 for(int e : bookingNo) {
//			 System.out.println(e);//5,6,7,8,9 in seperate line
//			 counter++;//to print with index
			 
	//	 }
			 //Index based loop print along with index
			 
	         			 
//				for(int k=0; k<bookingNo.length ; k++) {
//					System.out.println(k);
//				   System.out.println(k+":"+bookingNo[k]); //0:5,1:6,----each line
//				}
				
				 
			//Object Array Static
		 
//		 Object ob[]= new Object[4];
//		 
//		 ob[0]="tina";
//		 ob[1]=12;
//		 ob[2]= 13.33;
//		 ob[3]= true;
//		 //ob[4]= "Chia";
//				 
//		// System.out.println(ob[4]);//AIOB
//		 
//		 for(Object e : ob) {
//			 System.out.println(e);
//		 }
		 
		 //Array Literals
		 
		 int a[]= {10,11,12,13,14};
		 
		 System.out.println(a.length);//5
		 System.out.println(a[3]);//13
		 System.out.println("Hi:"+ (a.length-1));//Hi:4
		 
		 
		 for(int e : a) {
			 System.out.println(e);//10,11,12--
			 
		 }

		 System.out.println(Arrays.toString(a));//[11,12---]
		 
		 
		 
			 } 
			 
			 
			 
		 }
		 
		 
	


