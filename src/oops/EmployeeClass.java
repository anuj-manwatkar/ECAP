package oops;

public class EmployeeClass {
	//Variables    - attributes => 4
	int eid;
	String ename;
	String ejob;
	int esal;
			
	//Methods      - behavior => 1
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(ejob);
		System.out.println(esal);
	}
	
	
	public static void main(String[] args) {
		//Objects - can create multiple objects having class attribute & behavior, but data should unique 
		EmployeeClass emp1 = new EmployeeClass();  //Created object here 'new' is => object 
		emp1.eid = 1; //Calling Variables and Assigning Value to it
		emp1.ename = "Anuj Manwatkar";
		emp1.ejob = "Developer";
		emp1.esal = 400000;
		emp1.display();  //Calling Display methods here
		System.out.println();
		
		EmployeeClass emp2 = new EmployeeClass();
		emp2.eid = 2;
		emp2.ename = "Harsh";
		emp2.ejob  = "Developer";
		emp2.esal = 100000;
		emp2.display();
	}

}
