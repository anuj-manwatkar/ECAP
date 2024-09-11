package operators;

public class LogicalOperator_4 {

	public static void main(String[] args) {
		//Logical Operator = && , || , !
		
		//Logical Operator = && (AND)
		int a = 10;
		
		System.out.println((a > 8) && (a < 10));   //both condition should be true
		
		//Logical Operator = || (OR)
		int b = 12;
		
		System.out.println((b > 11) || (b < 12)); //either condition should true
		
		//Logial Operator = ! (NOT)
		int c = 12;
		
		System.out.println(!((c > 11) && (c < 13)));  //reverse the result

		
	}

}
