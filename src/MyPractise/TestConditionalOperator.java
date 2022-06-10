package MyPractise;

public class TestConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String Enviroment= "QA";
//		
//		if (Enviroment.equals("QA") ) {
//			System.out.println("Launch QA");
//		}  else {
//			System.out.println("QA Env not available");
//		}
//		  if (Enviroment.equals("Dev")) {
//			System.out.println("Launch Dev");
//		}else {
//			System.out.println("Dev Env not available");
//		}
//		  if (Enviroment.equals("Prod")) {
//				System.out.println("Launch Prod");
//			}  else {
//				System.out.println(" Prod Env not available");
	//			}
		// No of new corona cases by state if else example 

//		String State= "MH";
//		
//		if (State=="MH") {
//			System.out.println("Maharashtra has 320 new cases");
//		}else {
//				System.out.println("No new cases");
//		}
//		if (State=="DL") {
//			System.out.println("Delhi has 440 new cases");
//		}else {
//				System.out.println("No new cases");
//		}	
//		if (State=="JK") {
//			System.out.println("Jammu has 320 new cases");
//		}else {
//				System.out.println("No new cases");
//		}
//		if (State=="GL") {
//			System.out.println("Gujarat has 280 new cases");
//		} else {
//			System.out.println("No new cases");
//		}
//		
//		If Else if:example --only one condition executed -Gujarat has 280 new cases
	
		String state = "m";
		

		if (state.toUpperCase().equals("MH") ) {
			System.out.println("Maharashtra has 320 new cases");
		}

		else if (state .toUpperCase().equals("DL")) {
			System.out.println("Delhi has 440 new cases");
			
		} else if (state .toUpperCase().equals("JK")) {
			System.out.println("Jammu has 320 new cases");
			
		} else if (state .toUpperCase().equals("GJ")) {
			System.out.println("Gujarat has 280 new cases");
			
		} else
			System.out.println("No new cases");
		
//	//	if if else :ex: -2cond execu-Delhi has 440 new cases and No New cases
		 
//	String state = "dl";
//
//	if (state.toUpperCase().equals("MH")) {
//		System.out.println("Maharashtra has 320 new cases");
//	}
//
//	if (state.toUpperCase().equals("DL")) {
//		System.out.println("Delhi has 440 new cases");
//	}
//	if (state.toUpperCase().equals("JK")) {
//		System.out.println("Jammu has 320 new cases");
//	}
//	if (state.toUpperCase().equals("GJ")) {
//		System.out.println("Gujarat has 280 new cases");
//	} else
//
//		System.out.println("No new cases");
		
		
	}

}
