package abstraction;

import java.util.Scanner;

public class Circle extends Shape{
	float radius;
	
	@Override
	void collectinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = sc.nextFloat();
	}
	@Override
	void calculatearea() {
		area = 3.14f*radius*radius;
	}
}
