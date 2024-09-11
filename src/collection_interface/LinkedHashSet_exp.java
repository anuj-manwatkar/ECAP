package collection_interface;

import java.util.LinkedHashSet;

public class LinkedHashSet_exp {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(40); //duplicate not allowed
		lhs.add(50.99);
		lhs.add(null); //null value accepted
		lhs.add("Anuj"); //string value accepted
		System.out.println(lhs);
	}

}

//Output => Order of insertion, (16) size 
//o/p
//[10, 20, 30, 40, 50]


//[10, 20, 30, 40, 50.99, null, Anuj]
//duplicates are not allowed, null value accepted, string data accepted, float value accepted