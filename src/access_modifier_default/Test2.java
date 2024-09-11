package access_modifier_default;

public class Test2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.x);
		t1.m1();

	}

}


//o/p
/*
10
This is m1
*/