package inheritance;

//2. MultiLevel Inheritance => Having One Parent class and one Child class which is inherited by another Sub child class..

class G{                  //Parent class => Super class 
	String g;
	void get() {
		System.out.println(g);
	}
}
class F extends G{       //Child class => sub class 
	String f;
	void print() {
		System.out.println(f);
	}
} 
class S extends F{       //Child class => sub class 
	String s;
	void show() {
		System.out.println(s);
	}
	
}

public class MultiLevel_prac {
	public static void main(String[] args) {
		S sobj = new S();               //S obj is created because all data like variable & methods of SuperClass acquire by S subclass.
		sobj.g = "Vitthalrao Manwatkar";
		sobj.f = "Chandrashekhar Manwatkar";
		sobj.s = "Anuj Manwatkar";
		
		sobj.get();
		sobj.print();
		sobj.show();
		System.out.println();
		
		System.out.println("GrandParent class: "+sobj.g);
		System.out.println("Parent class: "+sobj.f);
		System.out.println("Child class: "+sobj.s);

	}

}
