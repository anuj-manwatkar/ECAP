package variables;

public class ThisKeyword {
	/*
	 This Keyword is used to differentiate => instance & local variable
	 1. instance variable => written inside class
	 2. local variable => written inside main method
	 
	 this keyword => is used to give the reference to the current object
	 
	 */
	//class variables /instance variables
	int x, y;  
	
	//constructor 
	ThisKeyword(int x, int y){  
		this.x = x;
		this.y = y;
	}
	
	//method
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword(10, 20);
		tk.display();

	}

}
