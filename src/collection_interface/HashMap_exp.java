package collection_interface;

import java.util.HashMap;

public class HashMap_exp {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Anuj", 80);
		hm.put("Anuj", 80); //key must be unique, value can be duplicate , If key is same then without caring value it will print once only
		hm.put("Harsh", 89.9);
		hm.put("Ayush", 78);
		hm.put("Kartik", 78);
		hm.put("Karan", 98);
		hm.put("K", 98); //If key is unique, then it will store value individual for both key, data might be whatever duplicate allowed
		hm.put(null, 98); //null value accepted
		System.out.println(hm);
	}

}

//Output => stores key value pair, randomly stored based on Hashing formula, for calculating address of memory location
//o/p 
//{Karan=98, Harsh=89.9, Anuj=80, Kartik=78, Ayush=78}
//note: 1. keys to values, cannot contain duplicate keys. means => key must be unique, value can be duplicate , If key is same then without caring value it will print once only

//o/p
//{Karan=98, Harsh=89.9, K=98, Anuj=80, Kartik=78, Ayush=78}
//note: 2. If key is unique, then it will store value individual for both key, data might be whatever duplicate allowed

//null, string, float, int all values are accepted