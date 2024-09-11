package collection_interface;

import java.util.ArrayList;

public class ArrayList_exp {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(30);
		al.add(null); //null value accepted
		al.add("Anuj"); //string value accepted
		al.add(true); 
		al.add(34.4); //float value accepted
		System.out.println(al);

	}

}

//output => to store dynamic array  we use ArrayList, (10) size
//o/p
//[10, 30, 30, null, Anuj, true, 34.4]
//note: duplicate are allowed, string null value also accepted
//indexing is needed in ArrayList