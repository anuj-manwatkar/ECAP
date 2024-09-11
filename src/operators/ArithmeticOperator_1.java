package operators;

public class ArithmeticOperator_1 {

	public static void main(String[] args) {
		//Arithmetic Operator = + , - , * , / , % , ++ , --
		
	
		int num1 = 10;
		int num2 = 5;
		
		//Arithmetic Operator = +
		int addition;
		addition = num1 + num2;
		System.out.println("Additon of two number is : "+addition);
		
		//Arithmetic Operator = -
		int substraction;
		substraction = num1 - num2;
		System.out.println("Substraction of tow number is : "+substraction);
		
		//Arithmetic Operator = *
		int multiplication;
		multiplication = num1 * num2;
		System.out.println("Multiplication of two number is : "+multiplication);
		
		//Arithmetic Operator = /
		int division;
		division = num1 / num2;    //20/30  - quotient
		System.out.println("Division of two number is : "+division);
		
		//Arithmetic Operator = %
		int modulus;
		modulus = num1 % num2;
		System.out.println("Modulus of two Number is : "+modulus);
		
		//Arithmetic Operator = ++
		//num1 = num1 + 1; (old way)
		num1++;
		System.out.println("Increment the actual value 10 by 1 i.e : "+num1);
		
		//Arithmetic Operator = --
		//num1 = num1 - 1; (old way)
		num1--;
		System.out.println("Decrement the actual value 11 by 1 i.e :"+num1);
		
		

	}

}
