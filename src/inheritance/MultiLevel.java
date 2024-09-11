package inheritance;

//2. MultiLevel Inheritance => Having One Parent class and one Child class which is inherited by another Sub child class..

class X{                        //Parent class => Super class 
	int a;
	void display() {
		System.out.println(a);
	}
}
class Y extends X{              //Child class => sub class 
	int b;
	void show() {
		System.out.println(b);
	}
}
class E extends Y{            //Child class => sub class 
	int c;
	void print() {
		System.out.println(c);
	}
}



public class MultiLevel {
	public static void main(String[] args) {
		E obj = new E();       //E obj is created because all data like variable & methods of SuperClass acquire by E subclass.
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		obj.display();
		obj.show();
		obj.print();
	}

}
