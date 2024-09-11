package abstraction;

public abstract class Shape { //If at least one method, then class name as a abstract method
	float area;
	abstract void collectinput(); //we don't know the implementation, abstract method
	abstract void calculatearea(); //we don't know the implementation, abstract method
	void display() {
		System.out.println("The area is"+" "+area);
	}

}
