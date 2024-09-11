package operators;

public class Conditional_If_Else_If {

	public static void main(String[] args) {
		//Conditional Operator = if-else-if ladder
		
		int age = 41;
		
		if(age < 20) {
			System.out.println("Age is less than 20");
		}else if(age < 30) {
			System.out.println("Age is less than 30");
		}else if(age < 40) {
			System.out.println("Age is less than 40");
		}else {
			System.out.println("Age Not Matched");
		}

	}

}
