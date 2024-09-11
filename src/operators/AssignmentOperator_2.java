package operators;

public class AssignmentOperator_2 {

	public static void main(String[] args) {
		//Assignment Operator = += , -=, *= , /= , %= 
		
		
		//Assignment Operator = +=
		int a = 12;
		a+=3;
		System.out.println("Here +=3 incrementing the existing value 12 by 3 and updating the same : "+a);
		
		//Arithmetic Operator = -=
		int b = 15;
		b-=3;
		System.out.println("Here -=3 decrementing the existing value 15 by 3 and updating the same : "+b);
		
		//Arithmetic Operator = *=
		int c = 15;
		c*=2;
		System.out.println("Here *=2 multiplying the existing value 15 by 2 and updating the same : "+c);
		
		//Arithmetic Operator = /=
		int d = 10;
		d/=5;
		System.out.println("Here /=5 dividing the existing value 10 by 5 and updating the same : "+d);
		
		//Arithmetic Operator = %=
		int m = 10;
		m%=5;
		System.out.println("Here %=5 modulus the existing value 10 by 5 and updating the same : "+m);
	}

}
