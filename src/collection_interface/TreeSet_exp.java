package collection_interface;

import java.util.TreeSet;

public class TreeSet_exp {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(50); //duplicates are not allowed
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		ts.add(35);
		ts.add(65);
		ts.add(85);
		//ts.add(null); //doesn't take null value
		System.out.println(ts);

	}

}

//output => ascending order to organize data we use TreeSet, (16) size
//o/p
//[25, 35, 50, 65, 75, 85, 100, 125, 150, 175] 
//note: duplicates are not allowed, null value no accepted, string & float also  not accepted
//No indexing is needed in TreeSet