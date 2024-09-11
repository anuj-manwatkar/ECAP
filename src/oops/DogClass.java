package oops;

public class DogClass {
	//Properties / Variables
	String name;
	String breed;
	String color;
	double height;
	double weight;
	int age;
	
	//Behavior / Methods
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Breed: "+breed);
		System.out.println("Color: "+color);
		System.out.println("Height: "+height+" cm");
		System.out.println("Weight: "+weight+" kg");
		System.out.println("Age: "+age+" years");
	}
	
	//More Methods of Dog 
	void walk() {
		System.out.println(name+" is walking.");
	}
	void sleep() {
		System.out.println(name+" is sleeping.");
	} 
	void eat() {
		System.out.println(name+" is eating.");
	}
	void bark() {
		System.out.println(name+" is barking.");
	}
	void jump() {
		System.out.println(name+" is jumping");
	}
	void bite() {
		System.out.println(name+" is biting");
	}
	
	
	
	
	public static void main(String[] args) {
	//Objects
	DogClass dog1 = new DogClass();
	dog1.name = "Oscar";
	dog1.breed = "Golden Retriver";
	dog1.color = "Golden";
	dog1.height = 93.76;
	dog1.weight = 18.05;
	dog1.age = 6;
	dog1.display();
	dog1.walk();
	dog1.sleep();
	dog1.eat();
	dog1.bark();
	dog1.jump();
	dog1.bite();
	
	System.out.println();
	
	 DogClass dog2 = new DogClass();
	 dog2.name = "Simba";
	 dog2.breed = "Boxer";
	 dog2.color = "Blackish Brown";
	 dog2.height = 123.76;
	 dog2.weight = 54.50;
	 dog2.age = 8;
	 dog2.display();
	 dog2.walk();
	 dog2.sleep();
	 dog2.eat();
	 dog2.bark();
	 dog2.jump();
	 dog2.bite();
	}

}
