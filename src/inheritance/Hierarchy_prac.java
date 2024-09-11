package inheritance;

//3. Hierarchical Inheritance => Have One Super Parent class and different Sub Child classes and child having no access/no relation to each other 

class SuperBoss{              //Super Class //Parent Class
	void get(String dad) {
		System.out.println(dad);
	}
}
class Son1 extends SuperBoss{     //Child class //Sub Class
	void take(String child1) {
		System.out.println(child1);
	}
}
class Son2 extends Son1{          //Child class //Sub Class
	void input(String child2) {
		System.out.println(child2);
	}
}
class Son3 extends Son2{          //Child class //Sub class
	void display(String child3) {
		System.out.println(child3);
	}
}


public class Hierarchy_prac {
	public static void main(String[] args) {
	Son1 s1obj = new Son1();                             //Son1 obj is created because all data like variable & methods of SuperClass acquire by Son1 subclass and independent to other    
	s1obj.get("Single Parent: Chandrashekhar Manwatkar");
	s1obj.take("Child 1: Anuj Manwatkar");
	System.out.println();
	
	Son2 s2obj = new Son2();                             //Son2 obj is created because all data like variable & methods of SuperClass acquire by Son2 subclass and independent to other
	s2obj.get("Single Parent: Chandrashekhar Manwatkar");
	s2obj.input("Child 2: Vidit Manwatkar");
	
	System.out.println();
	
	Son3 s3obj = new Son3();                            //Son3 obj is created because all data like variable & methods of SuperClass acquire by Son3 subclass and independent to other
	s3obj.get("Single Parent: Chandrashekhar Manwatkar");
	s3obj.display("Child 3: Girl");
	
	}

}
