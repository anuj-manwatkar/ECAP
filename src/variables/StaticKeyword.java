package variables;

public class StaticKeyword{

	/*
	Static Keyword
	1. static variable     | non static variable
	2. static method       | non static method
	
	Rules: 1. static method can directly access static variable & static method => [without creating an object] | help of static method i.e. main
	       2. static method can access non static stuff(variable/method) => creating object. | create object in main method
	       3. non static method can access everything directly. => Non-Static Method Accessing Everything
	               In the StaticKeyword class, the non-static method m2() can access both static and non-static members directly.
	*/
	//Variables
	int a = 10;   //non static variable
	static int b = 20; //static variable
	
	//Methods
	// Static Method
	static void m1() {   //static method
		System.out.println("This is m1");
	}
	
	// Non-Static Method
	void m2() {    //non static method
		System.out.println("This is m2");
		System.out.println(a); // 3. non static method can access everything directly. => non static variable
		m1();   //3. non static method can access everything directly. => static variable
	}
	
	public static void main(String[] args) {
		System.out.println("This is Static variable : ");
		
		System.out.println("Static variable b: " + b);  // Accessing static variable directly
		m1(); // Calling static method directly
		System.out.println();
		
		StaticKeyword sk = new StaticKeyword();  // Creating an object of the class
		System.out.println("Non-static variable a: " + sk.a);  // Accessing non-static variable through the object
		sk.m2(); // Calling non-static method through the object
	
	}
	
}
