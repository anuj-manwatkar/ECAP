package methods;


//User defined class
class Calculator{
	//Methods
	//1. Functions don't accept any input and doesn't return any value
	void add() { //no accepts inputs; void - nothing return
		int num1, num2, sum;
		num1 = 10;
		num2 = 40;
		sum = num1 + num2;
		System.out.println("The sum is"+" "+sum);
	}
	
}


public class NoInputNoReturn {	
	public static void main(String[] args) {
	Calculator c1 = new Calculator();
	c1.add();

	}

}
