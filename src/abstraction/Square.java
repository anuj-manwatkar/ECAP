package abstraction;

import java.util.Scanner;

public class Square extends Shape{
	float length;
	
	@Override
	void collectinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		length = sc.nextFloat();
	}
	@Override
	void calculatearea() {
		area = length * length;
	}
	
}

