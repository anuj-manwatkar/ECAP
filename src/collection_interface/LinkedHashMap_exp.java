package collection_interface;

import java.util.LinkedHashMap;

public class LinkedHashMap_exp {

	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Anuj", 10);
		lhm.put("Harsh", 20);
		lhm.put("Ayush", 30.78);
		lhm.put(null, 32); //null value accepted
		lhm.put("Kartik", 40);
		lhm.put("Kartik", 40); //duplicates are not allowed
		System.out.println(lhm);
	}

}

//Output => Order of insertion either use [LinkedHashMap / LinkedHashSet]

//o/p
//{Anuj=10, Harsh=20, Ayush=30, Kartik=40}

//note: duplicates are not allowed
