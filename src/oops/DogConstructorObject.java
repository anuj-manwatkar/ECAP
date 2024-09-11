package oops;

//Feature = Using Constructor we will initializing object in this program
public class DogConstructorObject {
	//Variables
	String name;
	String breed;
	String color;
	double height;
	double weight;
	int age;
	
	
	//Required Keyword -2. syntax: Dog(all variables){reference to current object i.e. this.name = name,} => constructor to initialize Dog object
	//                 -1.  this - gives reference to the current object of class 
	
	//Methods
	//Constructor to initialize the Dog object [i.e. Class_Dog_ConstrObject] 
	DogConstructorObject(String name, String breed, String color, double height, double weight, int age) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Breed: "+breed);
		System.out.println("Color: "+color);
		System.out.println("Height: "+height+" cm");
		System.out.println("Weight: "+weight+" kg");
		System.out.println("Age: "+age+" years");
	}
	//More Methods of Dog: walk, eat, sleep, bark, bite, jump
	void walk() {
		System.out.println(name+" is walking");
	}
	void eat() {
		System.out.println(name+" is eating.");
	}
	void sleep() {
		System.out.println(name+" is sleeping.");
	}
	void bark() {
		System.out.println(name+" is barking.");
	}
	void bite() {
		System.out.println(name+" is biting.");
	}
	void jump() {
		System.out.println(name+" is Jumping.");
	}
	
	public static void main(String[] args) {
		//Objects
		DogConstructorObject dog1 = new DogConstructorObject("Bunny" , "Golden Rotriever" , "Golden" , 59.78 , 37.80 , 12);
		DogConstructorObject dog2 = new DogConstructorObject("Lucky" , "Beagle" , "Brown" , 20.78 , 23.80 , 3);
		DogConstructorObject dog3 = new DogConstructorObject("Mass" , "Bull Dog" , "Brindle" , 45.65 , 46.30 , 6);
		dog1.display();
		dog1.walk();
		dog1.eat();
		dog1.sleep();
		dog1.bark();
		dog1.bite();
		dog1.jump();
		System.out.println();
		
		dog2.display();
		dog2.walk();
		dog2.eat();
		dog2.sleep();
		dog2.bark();
		dog2.bite();
		dog2.jump();
		System.out.println();
		
		dog3.display();
		dog3.walk();
		dog3.eat();
		dog3.sleep();
		dog3.bark();
		dog3.bite();
		dog3.jump();

	}

}
