package interface_;

public class Demo2 implements Compute{
	@Override
	public void add() {
		float num1, num2, res;
		num1 = 10.34f;
		num2 = 43.3f;
		res = num1 + num2;
		System.out.println("The result is"+" "+res);
	}
	@Override
	public void sub() {
		float num1, num2, res;
		num1 = 35.5f;
		num2 = 32.4f;
		res = num1 - num2;
		System.out.println("The result is"+" "+res);
	}
}
