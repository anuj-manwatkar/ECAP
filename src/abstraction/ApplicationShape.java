package abstraction;

public class ApplicationShape {

	public static void main(String[] args) {
		//1. Circle 
		System.out.println("Calculating area of circle");
		Circle cl = new Circle();
		cl.collectinput();
		cl.calculatearea();
		cl.display();
		
		//2. Square
		System.out.println("Calculating area of square");
		Square sq = new Square();
		sq.collectinput();
		sq.calculatearea();
		sq.display();
	}

}



//o/p
/*1. circle
Calculating area of circle
Enter the radius
23.3
The area is 1704.6746

2. Square
Calculating area of square
Enter the length
12
The area is 144.0
*/