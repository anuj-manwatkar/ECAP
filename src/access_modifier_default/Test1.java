package access_modifier_default;

public class Test1 {
	int x = 10;
	void m1() {
		System.out.println("This is m1");
		
	/*
	 private int x = 10;          //only same class access => for private
	 private void m1() {
		System.out.println("This is m1");
	*/
	}
}
