package methods;

//User define class
class Return{
	//Method
	//3. functions doesn't accept any input but returns a value 
	int add() {
		int num1, num2, sum;
		num1 = 10;
		num2 = 40;
		sum = num1 + num2;
		return sum;
	}
	
}

public class NoInputReturnValue {
	public static void main(String[] args) {
		Return c1 = new Return();
		int res = c1.add();
		System.out.println("The sum is"+" "+res);

	}

}
