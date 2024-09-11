package inheritance;

//1. Single Level Inheritance => Having one Parent & one child class

class Father{                              //Parent class //Superclass
	String dad = "Chandrashekhar Manwatkar";
	void display() {
		System.out.println(dad);
	}
}
class Child extends Father{                //Child class //Subclass
	String son = "Anuj Manwatkar";
	void print() {
		System.out.println(son);
	}
}

public class Single_prac {
	public static void main(String[] args) {
		Child c1 = new Child();             //Child1 obj is created because all data like variable & methods acquire by Child1 subclass
		c1.display();
		c1.print();
		System.out.println("Parent: "+c1.dad);
		System.out.println("Child: "+c1.son);

	}

}
