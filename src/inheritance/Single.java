package inheritance;

//1. Single Level Inheritance => Having one Parent & one child class

class A{                       //Parent class //Superclass
	int a = 100;
	void display() {
		System.out.println(a);
	}
}
class B extends A{             //Child class //Subclass
	int b = 200;
	void print() {
		System.out.println(b);
	}
}


public class Single {
	public static void main(String[] args) { 
		B obj = new B();          //B obj is created because all data like variable & methods acquire by B subclass
		obj.display(); 
		obj.print();
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
