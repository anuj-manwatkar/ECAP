package datatypes;

public class Byte1 {

	public static void main(String[] args) {
		//Default Value = 0
/*		byte b = 21;
		
		System.out.println(b);
*/
		
		byte age = 21;
		
		if(age >= 21) {
			System.out.println("Eligible to Vote");
		}else if(age >= 5) {
			System.out.println("Eligible for Admission");
		}else {
			System.out.println("Not Eligible to vote as well for admission");
		}
	}

}
