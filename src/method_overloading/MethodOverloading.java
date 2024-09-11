package method_overloading;

//User define class
class Adder{
	//Methods Overloading - Polymorphism(Constructor)
/*
	 1. Check the number of parameters
	 2. Check the data types of parameters
	 3. check the order of parameters
*/
	//Methods
	void add() {                         //1            
		int num1, num2, sum;
		num1 = 10;
		num2 = 40;
		sum = num1 + num2;
		System.out.println("The sum is "+sum);
	}
	void add(float a, float b) {          //2
		float res;
		res = a + b;
		System.out.println("The sum is "+res);
	}
	void add(double a, double b) {        //3  //For checking order. if again 2). (double a, int b) then don't give, change the order i.e.(int a, float b);
		double res;
		res = a + b;
		System.out.println("The sum is "+res);
	}
	void add(int a, float b) {             //4
		float res;
		res = a + b;
		System.out.println("The sum is "+res);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Adder adr = new Adder();
		adr.add();
		adr.add(23.12f, 43.22f);
		adr.add(1234.222, 3332.4321);
		adr.add(23, 23.11f);

	}

}
