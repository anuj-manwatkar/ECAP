package polymorphism;

//User define class
class Box{               //Class Box
	double width, height, depth;
	
	//default Constructor     //Only we can declare only data here
	Box(){
		width = 0;
		height = 0;           
		depth = 0;
	}
	//Constructor with parameter - 2
	Box(double w, double h, double d){  //We can not perform operations here
		width = w;
		height = h;
		depth = d;
	}
	//Again Constructor with parameter - 3
	Box(double len){
		width = height = depth = len;
	}
	
	//Method without parameter- 1       //We an perform operations in methods only.
	double volume() {
		return(width*height*depth);
	}
}
public class Polymorphism_OverloadingContr {
	public static void main(String[] args) {
		//Box b = new Box();
		Box b = new Box(10.5, 15.5, 5.0); //2
		System.out.println(b.volume()); 
	} 

}
