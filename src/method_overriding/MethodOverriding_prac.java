package method_overriding;

//1. Method Overriding => required multiple classes and classes present in Hierarchy Inheritance and Method Overriding only possible through [Inheritance]
/*
 Use of Method Overriding =>  
       1. Child class/Sub class is able to use the method/ implement the certain method , which is already provided by Parent class.
         -Accept just modify the body
*/

class Bank1{      //Parent class //Super class 
	int GETroi() {   //Method //Definition //Signature => same
		return 0; //Implementation => different         //return 0 - that the function doesn't return any value
	}
}
class BOI extends Bank1{   //Sub class //Child class
	int GETroi() {         //Definition => same
		return 10;         //Implementation => different
	}
}
class BOB extends BOI{    //Sub class // Child class
	int GETroi() {        //definition => same
		return 15;        //Implementation => different
	}
}

public class MethodOverriding_prac {
	public static void main(String[] args) {
	BOI boiobj = new BOI();                            //BOI obj is created because all the prop & meth of Bank is acquired by BOI and all child are independent here
	System.out.println("This is Bank 1: "+boiobj.GETroi());
	
	BOB bobobj = new BOB();                           //BOB obj is created because all the prop & meth of Bank is acquired by BOB and all child are independent here
	System.out.println("This is Bank 2: "+bobobj.GETroi());

		
	//Optionally if you want to print Parent class create Obj
	Bank banobj = new Bank();
	System.out.println("This is Category Bank: "+banobj.getROI());
	}

}
