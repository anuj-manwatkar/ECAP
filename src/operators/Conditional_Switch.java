package operators;

public class Conditional_Switch {

	public static void main(String[] args) {
		//Conditional Operator = switch (alternative of if-else-if ladder just syntax different)

		int color = 3;
		
		switch(color) {
		case 1: {
			System.out.println("Bulb is : Red Color");
			break;
		}
		case 2: {
			System.out.println("Bulb is : Green Color");
			break;
		}
		case 3:{
			System.out.println("Bulb is : Blue Color");
			break;
		}
		default:{
			System.out.println("Invalid Data");
		}
		}
	}

}
