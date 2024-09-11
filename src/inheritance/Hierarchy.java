package inheritance;

//3. Hierarchical Inheritance => Have One Super Parent class and different Sub Child classes and child having no access/no relation to each other 

class Parent{                     //Super Class //Parent Class
	void display(int a) {
		System.out.println(a);
	}
}
class Child1 extends Parent{       //Child class //Sub Class
	void show(int b) {
		System.out.println(b);
	}
}
class Child2 extends Child1{      //Child class //Sub Class
	void print(int c) {
		System.out.println(c);
	}
}
class Child3 extends Child2{      //Child class //Sub Class
	void prints(int d) {
		System.out.println(d);
	}
}

public class Hierarchy {
	public static void main(String[] args) {
	Child1 c1 = new Child1();     //Child1 obj is created because all data like variable & methods of SuperClass acquire by Child1 subclass and independent to other
	c1.display(10);
	c1.show(20);
	
	Child2 c2 = new Child2();    //Child2 obj is created because all data like variable & methods of SuperClass acquire by Child2 subclass and independent to other
	c2.print(30);
	c1.display(40);
	
	Child3 c3 = new Child3();    //Child3 obj is created because all data like variable & methods of SuperClass acquire by Child3 subclass and independent to other
	c3.prints(50);
	c3.display(60);

	}

}
