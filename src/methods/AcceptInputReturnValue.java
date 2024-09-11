package methods;

//user define class
class Value{
	//Method
	//4. Functions which accept inputs and return a value
	int add(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
}

public class AcceptInputReturnValue {
	public static void main(String[] args) {
		Value v1 = new Value();
		int res = v1.add(50, 50);
		System.out.println("The sum is"+" "+res);

	}

}
