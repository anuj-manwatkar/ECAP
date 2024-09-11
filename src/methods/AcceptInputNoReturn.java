package methods;

//User define class
class Calculator1{
	//Methods
	//1. Functions Accept inputs and doesn't return any value
	void add(int num1, int num2) { //accepting - inputs
		int sum;
		sum = num1 + num2;
		System.out.println("The sum is"+" "+sum);
	}
}


public class AcceptInputNoReturn {
	public static void main(String[] args) {
	Calculator1 c1= new Calculator1();
	c1.add(10, 40);
	
	}

}
