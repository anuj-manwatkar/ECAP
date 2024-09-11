package method_overriding;

class Bank{
	//Methods OverRiding - Inheritance(Hierarchy)
	//1. Method Overriding => required multiple classes and classes present in Hierarchy Inheritance and Method Overriding only possible through [Inheritance]
			/*
			 Use of Method Overriding =>  
			       1. Child class/Sub class is able to use the method/ implement the certain method , which is already provided by Parent class.
			         -Accept just modify the body
			*/
	
	int getROI() { //signature //definition //method => same
		return 0;  //implementation => should be different
	}
}
class SBI extends Bank{
	int getROI() { //signature //definition //method => same
		return 10; //implementation => should be different
	} 
}
class ICICI extends Bank{
	int getROI() { //signature //definition //method => same
		return 15; //implementation => should be different
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.getROI());
		ICICI iciciobj = new ICICI();
		System.out.println(iciciobj.getROI());
		
		//Optionally if you want to print Parent class
		Bank ban = new Bank();
		System.out.println(ban.getROI());

	}

}
