package javasessions;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int a = 10;
				int b = 20;

				System.out.println(a > b);

				if (a > b) {
					System.out.println("a is gr than b");
				} else {
					System.out.println("b is gr than a");
				}

				if (true) {
					System.out.println("Hi");
				} else {
					System.out.println("Bye");
				}

				boolean flag = true;
				if (flag) {
					System.out.println("JAVA");
				} else {
					System.out.println("Python");
				}

				//
				// nested if
				int marks = 97;
				if (marks <= 100) {
					if (marks >= 95) {
						System.out.println("A++ Grade");
					} 
					else {
						if (marks <= 30) {
							System.out.println("FAIL");
						} else {
							System.out.println("A Grade");
						}

					}
				} 
				else {
					System.out.println("Wrong marks");
				}

				//
				int p = 10;
				int q = 10;
				if(p==q) {
					System.out.println("hello");
				}
	}

}
