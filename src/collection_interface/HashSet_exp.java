package collection_interface;

import java.util.HashSet;

public class HashSet_exp {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(50);
		hs.add(40.98);
		hs.add(80);
		hs.add(70);
		hs.add(70);
		hs.add(null); //null value accepted
		hs.add("Anuj"); //string value accepted
		System.out.println(hs);

	}

}

//output => data stores randomly based on hashing formula (16) size
//o/p 
//[80, 50, 70, 40, 10]
//note: data is stored randomly based on HashSet Formula 

//[80, null, 50, 70, 10, Anuj, 40.98]
//duplicates are not allowed, null value accepted, string accepted, float value accepted